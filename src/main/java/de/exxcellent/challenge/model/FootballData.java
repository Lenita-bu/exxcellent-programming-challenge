package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class FootballData {
    @CsvBindByName(column = "Team")
    public String team;
    @CsvBindByName(column = "Games")
    public int games;
    @CsvBindByName(column = "Wins")
    public int wins;
    @CsvBindByName(column = "Losses")
    public int losses;
    @CsvBindByName(column = "Draws")
    public int draws;
    @CsvBindByName(column = "Goals")
    public int goals;
    @CsvBindByName(column = "Goals Allowed")
    public int goalsAllowed;
    @CsvBindByName(column = "Points")
    public int points;

    public FootballData() { }

    public FootballData(String team, int games, int wins, int losses, int draws, int goals, int goalsAllowed, int points) {
        this.team = team;
        this.games = games;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.points = points;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public int getPoints() {
        return points;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

