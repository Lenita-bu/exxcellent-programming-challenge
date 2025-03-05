package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.utilities.CsvToModelReader;
import de.exxcellent.challenge.utilities.DataProcessor;

import java.io.FileNotFoundException;
import java.util.List;

public class WeatherAnalyzer {
    public List<WeatherData> weatherDataList;
    public WeatherAnalyzer(String fileName) throws FileNotFoundException {
        this.weatherDataList = CsvToModelReader.readWeatherData(fileName);
    }
    public WeatherAnalyzer(List<WeatherData> weatherDataList) {
        this.weatherDataList = weatherDataList;
    }
    public String analyzeSmallestTempSpread() {
        String dayWithSmallestTempSpread = DataProcessor.getSmallestSpread(
                weatherDataList,
                WeatherData::getMaximumTemperature,
                WeatherData::getMinimumTemperature,
                weatherData -> Integer.toString(weatherData.getDay()));
        return dayWithSmallestTempSpread;
    }
}
