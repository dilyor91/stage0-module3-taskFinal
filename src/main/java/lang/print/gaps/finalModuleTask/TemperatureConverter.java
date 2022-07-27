package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){
        double fahrenheit = (temperatureCelsius*1.8) + 32;
        System.out.println(fahrenheit);
    }
}
