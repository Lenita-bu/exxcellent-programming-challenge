package de.exxcellent.challenge;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.utilities.FileToModelReader;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileToModelReaderTest {
    @Test
    void testCsvFileExists() {
        String weatherFilePath = "src/main/resources/de/exxcellent/challenge/weather.csv";
        assertTrue(Files.exists(Paths.get(weatherFilePath)));
        String footballFilePath = "src/main/resources/de/exxcellent/challenge/football.csv";
        assertTrue(Files.exists(Paths.get(footballFilePath)));
    }

    @Test
    void testCsvParsingWeatherFile() throws FileNotFoundException {
        List<WeatherData> objects = FileToModelReader.readCsvData("weather.csv", WeatherData.class);

        assertNotNull(objects);
        assertFalse(objects.isEmpty());
        assertEquals(30, objects.size());

        assertEquals(88, objects.get(0).getMaximumTemperature());
        assertEquals(45, objects.get(29).getMinimumTemperature());

        assertEquals(94, objects.get(11).getMaxRelativeHumidity());
        assertEquals(70.4, objects.get(25).getAverageDewPoint());
    }
    @Test
    void testCsvParsingFootballFile() throws FileNotFoundException {
        List<FootballData> objects = FileToModelReader.readCsvData("football.csv", FootballData.class);

        assertNotNull(objects);
        assertFalse(objects.isEmpty());
        assertEquals(20, objects.size());

        assertEquals(79, objects.get(0).getGoals());
        assertEquals(36, objects.get(0).getGoalsAllowed());

        assertEquals("Sunderland", objects.get(16).getTeam());

    }
}
