package Parte2;

public class ConversorTemperatura {

    public ConversorTemperatura() {}

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}