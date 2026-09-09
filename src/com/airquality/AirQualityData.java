package com.airquality;

public class AirQualityData {

    private String location;
    private double pm25;
    private double pm10;
    private double co;
    private double no2;

    public AirQualityData(String location, double pm25, double pm10,
                          double co, double no2) {
        this.location = location;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.co = co;
        this.no2 = no2;
    }

    public String getLocation() {
        return location;
    }

    public double getPm25() {
        return pm25;
    }

    public double getPm10() {
        return pm10;
    }

    public double getCo() {
        return co;
    }

    public double getNo2() {
        return no2;
    }
}
