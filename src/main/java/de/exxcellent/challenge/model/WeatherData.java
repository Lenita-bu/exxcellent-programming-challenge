package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

public class WeatherData {
    @CsvBindByName(column = "Day")
    public int day;
    @CsvBindByName(column = "MxT")
    public int maximumTemperature;
    @CsvBindByName(column = "MnT")
    public int minimumTemperature;
    @CsvBindByName(column = "AvT")
    public int averageTemperature;
    @CsvBindByName(column = "AvDP")
    public double averageDewPoint;
    @CsvBindByName(column = "1HrP TPcpn")
    public int oneHourPrecipitation;
    @CsvBindByName(column = "PDir")
    public int prevailingWindDirection;
    @CsvBindByName(column = "AvSp")
    public double averageWindSpeed;
    @CsvBindByName(column = "Dir")
    public int direction;
    @CsvBindByName(column = "MxS")
    public int maxWidSpeed;
    @CsvBindByName(column = "SkyC")
    public double skyCover;
    @CsvBindByName(column = "MxR")
    public int maxRelativeHumidity;
    @CsvBindByName(column = "Mn")
    public int minRelativeHumidity;
    @CsvBindByName(column = "R AvSLP")
    public double averageSeaLevelPressure;

    public WeatherData() {}

    public WeatherData(int day, int maximumTemperature, int minimumTemperature, int averageTemperature, double averageDewPoint, int oneHourPrecipitation, int prevailingWindDirection, double averageWindSpeed, int direction, int maxWidSpeed, double skyCover, int maxRelativeHumidity, int minRelativeHumidity, double averageSeaLevelPressure) {
        this.day = day;
        this.maximumTemperature = maximumTemperature;
        this.minimumTemperature = minimumTemperature;
        this.averageTemperature = averageTemperature;
        this.averageDewPoint = averageDewPoint;
        this.oneHourPrecipitation = oneHourPrecipitation;
        this.prevailingWindDirection = prevailingWindDirection;
        this.averageWindSpeed = averageWindSpeed;
        this.direction = direction;
        this.maxWidSpeed = maxWidSpeed;
        this.skyCover = skyCover;
        this.maxRelativeHumidity = maxRelativeHumidity;
        this.minRelativeHumidity = minRelativeHumidity;
        this.averageSeaLevelPressure = averageSeaLevelPressure;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(int maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public int getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(int minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageDewPoint() {
        return averageDewPoint;
    }

    public void setAverageDewPoint(double averageDewPoint) {
        this.averageDewPoint = averageDewPoint;
    }

    public int getOneHourPrecipitation() {
        return oneHourPrecipitation;
    }

    public void setOneHourPrecipitation(int oneHourPrecipitation) {
        this.oneHourPrecipitation = oneHourPrecipitation;
    }

    public int getPrevailingWindDirection() {
        return prevailingWindDirection;
    }

    public void setPrevailingWindDirection(int prevailingWindDirection) {
        this.prevailingWindDirection = prevailingWindDirection;
    }

    public double getAverageWindSpeed() {
        return averageWindSpeed;
    }

    public void setAverageWindSpeed(double averageWindSpeed) {
        this.averageWindSpeed = averageWindSpeed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getMaxWidSpeed() {
        return maxWidSpeed;
    }

    public void setMaxWidSpeed(int maxWidSpeed) {
        this.maxWidSpeed = maxWidSpeed;
    }

    public double getSkyCover() {
        return skyCover;
    }

    public void setSkyCover(double skyCover) {
        this.skyCover = skyCover;
    }

    public int getMaxRelativeHumidity() {
        return maxRelativeHumidity;
    }

    public void setMaxRelativeHumidity(int maxRelativeHumidity) {
        this.maxRelativeHumidity = maxRelativeHumidity;
    }

    public int getMinRelativeHumidity() {
        return minRelativeHumidity;
    }

    public void setMinRelativeHumidity(int minRelativeHumidity) {
        this.minRelativeHumidity = minRelativeHumidity;
    }

    public double getAverageSeaLevelPressure() {
        return averageSeaLevelPressure;
    }

    public void setAverageSeaLevelPressure(double averageSeaLevelPressure) {
        this.averageSeaLevelPressure = averageSeaLevelPressure;
    }
}

