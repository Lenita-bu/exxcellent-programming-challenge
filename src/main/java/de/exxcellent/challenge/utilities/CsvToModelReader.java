package de.exxcellent.challenge.utilities;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.model.WeatherData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class CsvToModelReader {
    public static List<WeatherData> readWeatherData(String fileName) throws FileNotFoundException {
        Reader reader = new BufferedReader(new FileReader("src/main/resources/de/exxcellent/challenge/"+fileName));
        CsvToBean<WeatherData> csvReader = new CsvToBeanBuilder<WeatherData>(reader)
                .withType(WeatherData.class)
                .withSeparator(',')
                .build();
        return csvReader.parse();
    }
    public static List<FootballData> readFootballData(String fileName) throws FileNotFoundException {
        Reader reader = new BufferedReader(new FileReader("src/main/resources/de/exxcellent/challenge/"+fileName));
        CsvToBean<FootballData> csvReader = new CsvToBeanBuilder<FootballData>(reader)
                .withType(FootballData.class)
                .withSeparator(',')
                .build();
        return csvReader.parse();
    }
}
