package Interfaces.exercicio4;

import java.util.Scanner;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public Double celsiusParaFahrenheit(Double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public Double fahrenheitParaCelsius(Double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
