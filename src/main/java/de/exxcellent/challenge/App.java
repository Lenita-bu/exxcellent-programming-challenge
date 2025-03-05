package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.FootballAnalyzer;
import de.exxcellent.challenge.analyzer.WeatherAnalyzer;

import java.io.FileNotFoundException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        String programmeMode = args[0];
        String fileName = args[1];

        switch (programmeMode) {
            case "--weather":
                try {
                    WeatherAnalyzer analyzer = new WeatherAnalyzer(fileName);
                    int dayWithSmallestTempSpread = analyzer.analyzeSmallestTempSpread();
                    System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
                } catch (FileNotFoundException e) {
                    System.out.println(fileName+" not found");
                }
                break;
            case "--football":
                try {
                    FootballAnalyzer analyzer = new FootballAnalyzer(fileName);
                    String teamWithSmallestGoalSpread = analyzer.analyzeSmallestGoalSpread();
                    System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
                } catch (FileNotFoundException e) {
                    System.out.println(fileName+" not found");
                }
                break;
            default:
                System.out.println("Unknown programme mode");
        }

    }
}
