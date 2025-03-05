package de.exxcellent.challenge.analyzer;

import de.exxcellent.challenge.model.FootballData;
import de.exxcellent.challenge.utilities.CsvToModelReader;
import de.exxcellent.challenge.utilities.DataProcessor;

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
        String teamWithSmallestGoalSpread = DataProcessor.getSmallestSpread(
                footballDataList,
                FootballData::getGoals,
                FootballData::getGoalsAllowed,
                FootballData::getTeam);
        return teamWithSmallestGoalSpread;
    }
}
