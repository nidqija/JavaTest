package CP.Lab2;
import java.util.*;

public class Calculator {
    

    public static float add(float a , float b){
        return a + b;
    }


    public static float deduct( float a , float b){
        return a - b;
    }


    public static float multiply ( float a , float b){
        return a * b;
    }

    public static float divide ( float a , float b){
        return a / b;
    }


    public static void main(String[] args){
        System.out.println("Welcome to Calculator");
        System.out.println("Enter first number:");
        
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();


        System.out.println("Enter second number:");
        float num2 = scanner.nextFloat();


       
       System.out.println("Enter operation ( + , - , * , /):");
        String operation = scanner.next(); 

       /* ArrayList<Float> results = new ArrayList<Float>();
        
        results.add(add(num1 , num2));
        results.add(deduct(num1, num2));
        results.add(multiply(num1, num2));
        results.add(divide(num1, num2));

        for (int i = 0 ; i < results.size() ;i++){
            System.out.println("Result " + (i+1) + ": " + results.get(i));
        } */ 


      switch ( operation){

            case "+":
                System.out.println("This is an addition");
                float a = add(num1 , num2);
                System.out.println("Total is: " + a);
                break;

            case "-":
                System.out.println("This is a deduction");
                float deduction = deduct(num1 , num2);
                System.out.println("Total is: " + deduction);
                break;




            case "*":
                System.out.println("This is a multiplication");
                float multiplication = multiply(num1, num2);
                System.out.println("Total is: " + multiplication);
                break;




            case "/":
                System.out.println("This is a division");
                float division = divide(num1 , num2);
                System.out.println("Total is: " + division);
                break;


            default:
               System.out.println("Invalid Operation");
               return ;


        }  



        
    }
}
