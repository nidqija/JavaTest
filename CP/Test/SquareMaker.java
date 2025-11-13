package CP.Test;
import java.util.*;

public class SquareMaker {
    public static void main(String[] args){
        System.out.println("Enter the size of the square:");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();


       for ( int i = 0 ; i < x ; i ++){
        System.err.println(" * ");
        for ( int j = 0 ; j < x  ; j ++){
          //  System.out.print(" * ");
        }

        // print new line after each row
        System.out.println();

        // print anything as is using print()
        System.out.print("*");
       }
    }
}
