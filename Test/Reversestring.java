
package Test;

public class Reversestring{
    public static void main(String[] args) {
        String word = "Hello";
        String reversedword = "";

        for(int i = word.length() - 1 ; i >= 0; i--){
            reversedword += word.charAt(i);
        }

        System.out.println(reversedword);
    }
}