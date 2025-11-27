package Test;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        System.out.println("Enter operations to perform:");
        System.out.println("1. Addition: +");
        System.out.println("2. Subtraction: -");
        System.out.println("3. Multiplication: *");
        System.out.println("4. Division: /");

        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine(); // operation input

        System.out.println("Enter total number to perform operations on: ");

        int totalNumbers = scanner.nextInt(); // reuse same scanner

        int result = 0;

        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (i == 0) {
                result = number; 
            } else {
                switch (operation) {
    case "+": 
    case "1":
        result += number;
        break;
    case "-":
    case "2":
        result -= number;
        break;
    case "*":
    case "3":
        result *= number;
        break;
    case "/":
    case "4":
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Error: Division by zero!");
        }
        break;
    default:
        System.out.println("Invalid operation!");
        break;
}

            }

            System.out.println("Current Result: " + result);
        }

        System.out.println("---------------------------------");
        System.out.println("Final Result: " + result);

        scanner.close();
    }
}
