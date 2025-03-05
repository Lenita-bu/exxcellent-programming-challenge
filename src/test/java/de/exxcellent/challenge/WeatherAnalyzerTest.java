package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.WeatherAnalyzer;
import de.exxcellent.challenge.model.WeatherData;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherAnalyzerTest {
    @Test
    void testWeatherAnalyzerConstructor() throws FileNotFoundException {
        WeatherAnalyzer analyzer = new WeatherAnalyzer("weather.csv");
        assertNotNull(analyzer);
    }
    @Test
    void testAnalyzeSmallestTempSpread() {
        WeatherAnalyzer analyzer = new WeatherAnalyzer(List.of(
            new WeatherData(1,88,59,74,53.8,0,280,9.6,270,17,1.6,93,23,1004.5),
            new WeatherData(17,81,57,69,51.7,0,260,9.1,270,29,5.2,90,34,1012.5),
            new WeatherData(26,97,64,81,70.4,0,50,5.1,200,12,4,107,45,1014.9)
        ));
        int result1 = analyzer.analyzeSmallestTempSpread();
        analyzer = new WeatherAnalyzer(List.of(
                new WeatherData(22,90,64,77,61.1,0,250,6.4,230,9,0.2,78,38,1026.4),
                new WeatherData(5,90,66,78,68.3,0,220,8.3,260,12,6.9,84,55,1014.4),
                new WeatherData(4,77,59,68,51.1,0,110,9.1,130,12,8.6,62,40,1021.1
                )
        ));
        int result2 = analyzer.analyzeSmallestTempSpread();
        assertEquals(result1, 17);
        assertEquals(result2, 4);
    }
}
