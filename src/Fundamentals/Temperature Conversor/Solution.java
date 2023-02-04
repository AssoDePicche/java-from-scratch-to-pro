import java.util.Scanner;

public class Solution {
  public static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Type the numeric value of the temperature:");

    Double temperature = scanner.nextDouble();

    System.out.println("Choose the scale to the temperature:\n[1] Celsius\n[2] Fahrenheit\n[3] Kelvin\n[q] Quit");

    String temperatureScale = scanner.next();

    scanner.close();

    switch (temperatureScale) {
      case "q":
        System.out.println("Bye bye!");
        break;

      case "1":
        System.out.println(
            temperature + " ºC to Fahrenheit = " + TemperatureConversor.celsiusToFahrenheit(temperature) + " ºF");

        System.out.println(temperature + " ºC to Kelvin = " + TemperatureConversor.celsiusToKelvin(temperature) + " K");
        break;

      case "2":
        System.out
            .println(temperature + " ºF to Celsius = " + TemperatureConversor.fahrenheitToCelsius(temperature) + " ºC");

        System.out
            .println(temperature + " ºF to Kelvin = " + TemperatureConversor.fahrenheitToKelvin(temperature) + " K");
        break;

      case "3":
        System.out
            .println(temperature + " K to Celsius = " + TemperatureConversor.kelvinToCelsius(temperature) + " ºC");

        System.out.println(
            temperature + " K to Fahrenheit = " + TemperatureConversor.kelvinToFahrenheit(temperature) + " ºF");
        break;
    }

    System.out.println("Bye bye!");
  }
}
