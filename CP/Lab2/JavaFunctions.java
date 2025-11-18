package CP.Lab2;
import java.util.*;

public class JavaFunctions{

    // put void here , type of function is a must
    // void means no return type , destroy after execution
    public static void main(String[] args){
        System.out.println("Hello, World!");

    // calling the function
        System.out.println(add(10 , 40)); 


    // can store in a variable
        double a = add( 10 , 20);
        float b = divide(20, 10);
        
        System.out.println(a);
        System.out.println("Addition: " + a);
        System.out.println("Division: " + b );


        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    
       // does not display to cli
       // didnt put system.out.println
       // add(10 , 40);
    }


    // function with return type int
    // function type other than void must return a value of that type
    public static int add(int a , int b){
        return a + b;
    }


    public static int divide(int a , int b){
        return a / b;
    }

    // overloading the add function
    public static int add(int a , int b , int c){
        return a + b + c;
    }

    // overloading the add function
    public static int add(int a , int b , int c , int d){
        return a + b + c + d;
    }

    public static int deduct ( int a , int b){
        return a -b ;
    }


    /*
     * // this is wrong because of return type mismatch with the variables declaration 
     * public static double divide(int a , int b){
     * return a / b;
     * 
     * }
     */

    



   /*  public static int add(int a , int b){
        System.out.println(a + b);
        return 0;
    } */



}










