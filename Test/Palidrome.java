package Test;
import java.util.Scanner;


public class Palidrome {
    public static void main(String[] args) {

        String word;
        String reversedword = "";
        System.out.println("Enter a word");

        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();


        scanner.close();
        



        for( int i = word.length() - 1 ; i >= 0 ; i--){
            reversedword += word.charAt(i);
               
        }

        System.out.println(reversedword);

        int j = reversedword.length() - 1;

        if (word.charAt(j) == reversedword.charAt(j)){
            System.out.println("Its a palidrome");
        } else {
            System.out.println("Its not palidrome");
            }
        }


        
    }

