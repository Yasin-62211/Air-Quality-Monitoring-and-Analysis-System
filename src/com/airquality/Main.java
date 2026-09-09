package com.airquality;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("       AIR QUALITY MONITORING SYSTEM");
        System.out.println("========================================");

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.print("Enter PM2.5 value: ");
        double pm25 = scanner.nextDouble();

        System.out.print("Enter PM10 value: ");
        double pm10 = scanner.nextDouble();

        System.out.print("Enter CO value: ");
        double co = scanner.nextDouble();

        System.out.print("Enter NO2 value: ");
        double no2 = scanner.nextDouble();

        AirQualityData data =
                new AirQualityData(location, pm25, pm10, co, no2);

        int aqi = AQICalculator.calculateAQI(data);
        String status = AQICalculator.getAQIStatus(aqi);

        AirQualityAnalyzer.analyze(data);

        AlertSystem.checkAlert(aqi);

        ReportGenerator.generateReport(data, aqi, status);

        scanner.close();
    }
}