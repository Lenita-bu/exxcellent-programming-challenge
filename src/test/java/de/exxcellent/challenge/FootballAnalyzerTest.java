package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.FootballAnalyzer;
import de.exxcellent.challenge.model.FootballData;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FootballAnalyzerTest {
    @Test
    void testFootballAnalyzerConstructor() throws FileNotFoundException {
        FootballAnalyzer analyzer = new FootballAnalyzer("football.csv");
        assertNotNull(analyzer);
    }
    @Test
    void testAnalyzeSmallestGoalSpread() {
        FootballAnalyzer analyzer = new FootballAnalyzer(List.of(
            new FootballData("Ulm",38,26,9,3,10,1,87),
            new FootballData("Neu-Ulm",38,15,8,15,10,10,53)
        ));
        String result1 = analyzer.analyzeSmallestGoalSpread();

        assertEquals(result1, "Neu-Ulm");
    }
}
