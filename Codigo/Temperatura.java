public class Temperatura{
    public static double celciusToFahrenheit(double celcius){
        return celcius * 1.8 + 32;
    }

    public static double celciusToKelvin(double celcius) {
        return celcius + 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) *1.8 + 32;
    }

    public static double kelvinToCelcius(double kelvin) {
        return kelvin - 273.15;
    }
}