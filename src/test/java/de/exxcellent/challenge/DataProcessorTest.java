package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.FootballAnalyzer;
import de.exxcellent.challenge.analyzer.WeatherAnalyzer;
import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.utilities.DataProcessor;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataProcessorTest {
    @Test
    void testAnalyzeSmallestTempSpread() {
        WeatherAnalyzer weatherAnalyzer = new WeatherAnalyzer(List.of(
            new WeatherData(1,88,59,74,53.8,0,280,9.6,270,17,1.6,93,23,1004.5),
            new WeatherData(17,81,57,69,51.7,0,260,9.1,270,29,5.2,90,34,1012.5),
            new WeatherData(26,97,64,81,70.4,0,50,5.1,200,12,4,107,45,1014.9), new WeatherData(4,77,59,68,51.1,0,110,9.1,130,12,8.6,62,40,1021.1),
            new WeatherData(22,90,64,77,61.1,0,250,6.4,230,9,0.2,78,38,1026.4),
            new WeatherData(5,90,66,78,68.3,0,220,8.3,260,12,6.9,84,55,1014.4)
        ));

        String dayWithSmallestTempSpread = DataProcessor.getSmallestSpread(
                weatherAnalyzer.weatherDataList,
                WeatherData::getMaximumTemperature,
                WeatherData::getMinimumTemperature,
                weatherData -> Integer.toString(weatherData.getDay()));
        String dayWithSmallestHumiditySpread = DataProcessor.getSmallestSpread(
                weatherAnalyzer.weatherDataList,
                WeatherData::getMaxRelativeHumidity,
                WeatherData::getMinRelativeHumidity,
                weatherData -> Integer.toString(weatherData.getDay()));

        assertEquals(dayWithSmallestTempSpread, String.valueOf(4));
        assertEquals(dayWithSmallestHumiditySpread, String.valueOf(4));
    }
    @Test
    void testAnalyzeSmallestGoalSpread() {
        FootballAnalyzer footballAnalyzer = new FootballAnalyzer(List.of(
                new FootballData("Chelsea",38,17,13,8,66,38,64),
                new FootballData("Ipswich",38,9,9,20,41,64,36),
                new FootballData("Blackburn",38,12,10,16,55,51,46),
                new FootballData("Charlton",38,10,14,14,38,49,44)
        ));
        String teamWithSmallestGoalSpread = DataProcessor.getSmallestSpread(
                footballAnalyzer.footballDataList,
                FootballData::getGoals,
                FootballData::getGoalsAllowed,
                FootballData::getTeam);

        String teamWithSmallestWinsSpread = DataProcessor.getSmallestSpread(
                footballAnalyzer.footballDataList,
                FootballData::getWins,
                FootballData::getLosses,
                FootballData::getTeam);

        assertEquals(teamWithSmallestGoalSpread, "Blackburn");
        assertEquals(teamWithSmallestWinsSpread, "Ipswich");
    }
}