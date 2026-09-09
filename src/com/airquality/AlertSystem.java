package com.airquality;

import java.util.Scanner;

public class AlertSystem {

    public static void checkAlert(int aqi) {

        System.out.println("\n========== AIR QUALITY ALERT ==========");

        if (aqi <= 50) {
            System.out.println("✓ Air quality is good.");
            System.out.println("No health alert is required.");

        } else if (aqi <= 100) {
            System.out.println("⚠ Air quality is moderate.");
            System.out.println("Sensitive people should be careful.");

        } else if (aqi <= 150) {
            System.out.println("⚠ WARNING: Air quality is unhealthy for sensitive groups.");
            System.out.println("Reduce prolonged outdoor activities.");

        } else if (aqi <= 200) {
            System.out.println("🚨 ALERT: Air quality is unhealthy.");
            System.out.println("Limit outdoor activities.");

        } else if (aqi <= 300) {
            System.out.println("🚨 HIGH ALERT: Air quality is very unhealthy.");
            System.out.println("Avoid unnecessary outdoor activities.");

        } else {
            System.out.println("🚨 CRITICAL ALERT: Air quality is hazardous.");
            System.out.println("Avoid outdoor exposure and follow local health guidance.");
        }

        System.out.println("=======================================");
    }

    public static class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("========================================");
            System.out.println("   AIR QUALITY MONITORING SYSTEM");
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

            checkAlert(aqi);

            ReportGenerator.generateReport(data, aqi, status);

            scanner.close();
        }
    }
}