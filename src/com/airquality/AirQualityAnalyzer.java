package com.airquality;

public class AirQualityAnalyzer {

    public static void analyze(AirQualityData data) {

        int aqi = AQICalculator.calculateAQI(data);
        String status = AQICalculator.getAQIStatus(aqi);

        System.out.println("\n========== AIR QUALITY ANALYSIS ==========");
        System.out.println("Location : " + data.getLocation());
        System.out.println("PM2.5    : " + data.getPm25());
        System.out.println("PM10     : " + data.getPm10());
        System.out.println("CO       : " + data.getCo());
        System.out.println("NO2      : " + data.getNo2());
        System.out.println("------------------------------------------");
        System.out.println("AQI      : " + aqi);
        System.out.println("Status   : " + status);
        System.out.println("==========================================");
    }
}