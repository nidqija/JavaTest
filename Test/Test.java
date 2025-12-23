package Test;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char grade;
        System.out.print("Enter your grade (A, B, C, D, F): ");
        grade = sc.next().charAt(0);

        switch (grade) {
            case 'A', 'a' -> System.out.println("Excellent!");

            case 'B', 'b', 'C', 'c' -> 
                System.out.println("Good job!");

            case 'D', 'd' -> 
                System.out.println("You passed.");

            case 'F', 'f' -> 
                System.out.println("You failed.");

            default -> 
                System.out.println("Invalid grade.");
        }

        sc.close();
    }
}

