package com.homework.homework22;

public class TemperatureConverter {
    public static String temperatureKelvin() {
        double temperatureCelsius = 0;
        double temperatureKelvin = (temperatureCelsius + 273.15);
        return "The temperature " + temperatureCelsius + " °C equals to " + temperatureKelvin + " °K.";
        //System.out.println("The temperature " + temperatureCelsius + " °C equals to " + temperatureKelvin + " °K.");
    }

    public static String temperatureFahrenheit() {
        double temperatureCelsius = 0;
        double temperatureFahrenheit = ((9/5*temperatureCelsius)+32);
        return "The temperature " + temperatureCelsius + " °C equals to " + temperatureFahrenheit + " °F.";
        //System.out.println("The temperature " + temperatureCelsius + " °C equals to " + temperatureFahrenheit + " °F.");
    }
}