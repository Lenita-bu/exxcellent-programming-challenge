package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.utilities.CsvToModelReader;

import java.io.FileNotFoundException;
import java.util.List;

public class FootballAnalyzer {
    public List<FootballData> footballDataList;
    public FootballAnalyzer(String fileName) throws FileNotFoundException {
        this.footballDataList = CsvToModelReader.readFootballData(fileName);
    }
    public FootballAnalyzer(List<FootballData> footballDataList) {
        this.footballDataList = footballDataList;
    }
    public String analyzeSmallestGoalSpread() {
        int minDifference = footballDataList.get(0).getGoals() - footballDataList.get(0).getGoalsAllowed();
        String teamWithSmallestGoalSpread = "";
        for (FootballData element: footballDataList) {
            int goalsDifference = Math.abs(element.getGoals() - element.getGoalsAllowed());
            if (goalsDifference < minDifference) {
                minDifference = goalsDifference;
                teamWithSmallestGoalSpread = element.getTeam();
            }
        }
        return teamWithSmallestGoalSpread;
    }
}
