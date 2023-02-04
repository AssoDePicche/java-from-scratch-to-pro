public class TemperatureConversor {
  public static final double FAHRENHEIT_ABSOLUTE_ZERO = -459.67;

  public static final double FAHRENHEIT_FUSION_TEMPERATURE = 32;

  public static final double KELVIN_FUSION_TEMPERATURE = 273.15;

  public static final double CELSIUS_ABSOLUTE_ZERO = -273.15;

  public static final double CONVERSION_RATIO = 1.8;

  public static double celsiusToFahrenheit(double celsius) {
    return Double.valueOf((celsius * CONVERSION_RATIO) + FAHRENHEIT_FUSION_TEMPERATURE);
  }

  public static double celsiusToKelvin(double celsius) {
    return Double.valueOf(celsius - CELSIUS_ABSOLUTE_ZERO);
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return Double.valueOf((fahrenheit - FAHRENHEIT_FUSION_TEMPERATURE) * CONVERSION_RATIO);
  }

  public static double fahrenheitToKelvin(double fahrenheit) {
    return Double.valueOf((fahrenheit - FAHRENHEIT_ABSOLUTE_ZERO) * CONVERSION_RATIO);
  }

  public static double kelvinToCelsius(double kelvin) {
    return Double.valueOf(kelvin - KELVIN_FUSION_TEMPERATURE);
  }

  public static double kelvinToFahrenheit(double kelvin) {
    return Double.valueOf((kelvin - KELVIN_FUSION_TEMPERATURE) * CONVERSION_RATIO + FAHRENHEIT_FUSION_TEMPERATURE);
  }
}
