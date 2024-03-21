package com.homework.homework22;

public class CelsiusToKelvin extends TemperatureConverter {
    public static void main(String[] args) {
        double temperatureCelsius = 0;
        double temperatureKelvin = (temperatureCelsius + 273.15);
        //System.out.println("The temperature " + temperatureCelsius + " °C equals to " + temperatureKelvin + " °K.");
    }
}
//Для переводу градусів Цельсия у Кельвіни необхідно використовувати формулі T=t+T0,
//де T- температура у Кельвінах, t- температура в градусах Цельсія, T0=273.15 Кельвина;