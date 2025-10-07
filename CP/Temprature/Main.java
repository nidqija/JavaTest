/*
============================================================
Java Practice Question: Temperature Converter
============================================================

1. Ask the user to enter a temperature in Celsius.
   
2. Convert the temperature to Fahrenheit using the formula:
      F = C * 9/5 + 32

3. Convert the temperature to Kelvin using the formula:
      K = C + 273.15

4. Print the original Celsius temperature, the Fahrenheit temperature,
   and the Kelvin temperature.

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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      TempMeasure tempMeasure = new TempMeasure();
       Scanner scanner = new Scanner(System.in);
       double [] temp = new double[3];

      while (true){
        
     

       System.out.println("Enter temprature in Celsius: ");
       double celsius = scanner.nextDouble();

       if (celsius < -273.15){
        System.out.println("Temprature cannot be below absolute zero (-273.15 *C). Please enter a valid temprature.");
        
       } else {
         tempMeasure.setCelsius(celsius);
         temp[0] = tempMeasure.getCelsius();
         temp[1] = tempMeasure.convertToFahrenheit(celsius);
         temp[2] = tempMeasure.convertToKelvin(celsius);

         System.out.println("Temperature in Celsius: " + temp[0] + "°C");
         System.out.println("Temperature in Fahrenheit: " + temp[1] + "°F");
         System.out.println("Temperature in Kelvin: " + temp[2] + "K");
         scanner.close();
         break;
         
       }

     

     
      }
      
     
       
       

    }
}
