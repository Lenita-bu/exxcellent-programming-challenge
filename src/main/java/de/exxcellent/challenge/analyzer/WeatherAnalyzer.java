package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.WeatherData;
import de.exxcellent.challenge.utilities.CsvToModelReader;

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
    public int analyzeSmallestTempSpread() {
        int minSpread = weatherDataList.get(0).getMaximumTemperature() - weatherDataList.get(0).getMinimumTemperature();
        int dayWithSmallestTempSpread = 0;
        for (WeatherData element: weatherDataList) {
            int tempSpread = element.getMaximumTemperature() - element.getMinimumTemperature();
            if (tempSpread < minSpread) {
                minSpread = tempSpread;
                dayWithSmallestTempSpread = element.getDay();
            }
        }
        return dayWithSmallestTempSpread;
    }
}
