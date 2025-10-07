/*
============================================================
Java Practice Question: Temperature Converter
============================================================

1. Ask the user to enter a temperature in Celsius.
// temperature

   
2. Convert the temperature to Fahrenheit using the formula:
      F = C * 9/5 + 32

// covertToFahrenheit

3. Convert the temperature to Kelvin using the formula:
      K = C + 273.15

// convertToKelvin

4. Print the original Celsius temperature, the Fahrenheit temperature,
   and the Kelvin temperature.

// displayWeatherDetails

5. Input Validation:
      - The temperature cannot be below absolute zero (-273.15°C).
      - If the user enters a value below this, prompt them again.



Example Input:
    Enter temperature in Celsius: 25

Example Output:
    Temperature in Celsius: 25.0°C
    Temperature in Fahrenheit: 77.0°F
    Temperature in Kelvin: 298.15K

Concepts Practiced:
    - Reading numeric input using Scanner
    - Storing values in variables (double)
    - Performing arithmetic calculations
    - Conditional checks for valid input
    - Printing formatted output
============================================================
*/

package CP.Temprature;

public class TempMeasure {
    private double celsius;
    private double fahrenheit;
    private double kelvin;


    public double getCelsius(){
        return celsius;
    }

    public double getFahrenheit(){
        return fahrenheit;
    }

    public double getKelvin(){
        return kelvin;
    }



   public void setCelsius(double celsius){
    this.celsius = celsius;
    
   }

    public double convertToFahrenheit(double celsius){
        double f = (celsius * 9/5) + 32;
        return f;
    }

    public double convertToKelvin(double celsius){
        double k = celsius + 273.15;
        return k;
    }

    public void displayWheatherDetails(){
        System.out.println("Temperature in Celsius: " + celsius + "C");
        System.out.println("Temperature in Fahrenheit: " + convertToFahrenheit(celsius) + " F");
        System.out.println("Temperature in Kelvin: " + convertToKelvin(celsius) + " K");
    }




}
