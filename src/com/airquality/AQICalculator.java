package com.airquality;

public class AQICalculator {

    public static int calculateAQI(AirQualityData data) {

        double pm25 = data.getPm25();
        double pm10 = data.getPm10();

        double aqi = (pm25 / 35.4) * 100;

        if (pm10 > 150) {
            aqi += 20;
        }

        return (int) Math.round(aqi);
    }

    public static String getAQIStatus(int aqi) {

        if (aqi <= 50) {
            return "Good";
        } else if (aqi <= 100) {
            return "Moderate";
        } else if (aqi <= 150) {
            return "Unhealthy for Sensitive Groups";
        } else if (aqi <= 200) {
            return "Unhealthy";
        } else if (aqi <= 300) {
            return "Very Unhealthy";
        } else {
            return "Hazardous";
        }
    }
}