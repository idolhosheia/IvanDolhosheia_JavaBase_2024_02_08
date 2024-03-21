package com.homework.homework22;

public class CelsiusToFahrenheit extends TemperatureConverter {
    public static void main(String[] args) {
        double temperatureCelsius = 0;
        double temperatureFahrenheit = ((9/5*temperatureCelsius)+32);
        System.out.println("The temperature " + temperatureCelsius + " °C equals to " + temperatureFahrenheit + " °F.");
    }

}

//Для переводу градусів Цельсия у Фарінгейти необхідно використовувати формулу T = t х 1,8 + 32,
//де T - температура у Фаренгейтах, t- температура в градусах Цельсія. Приклад: 10°C x 1,8 + 32 = 50°F.