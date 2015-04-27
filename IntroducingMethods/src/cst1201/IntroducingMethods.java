
import java.util.Scanner;

public class IntroducingMethods {

    public static void main(String[] args) {
        // TODO: Fill in the body with your code
        System.out.print("Enter a string: ");

        Scanner keyboard = new Scanner(System.in);
        getInputString(keyboard);
    }

    private static String getInputString(Scanner inScanner) {

        String input = inScanner.nextLine();

        while (input.length() == 0) {

            System.out.println("ERROR - string must not be empty.");
            System.out.println("Enter a string: ");

            input = inScanner.nextLine();

            getWordCount(input);

        }

        getWordCount(input);

        return input;
    }
 // Given a String return the number of words in the String. A word is a sequence of
    // characters with no spaces. Write this method so that the function call:
    // int count = getWordCount("The quick brown fox jumped");
    // results in count having a value of 5. You will call this method from the main method.
    // For this assignment you may assume that
    // words will be separated by exactly one space.

    private static int getWordCount(String input) {
        // TODO: Fill in the body

        int wordCount = input.split(" ").length;

        System.out.println("Your string has " + wordCount + " words in it");

        return wordCount;
    }


 private static String getFirstWord(String input) {

if (input.indexOf(' ') > -1) {

 System.out.println("The first word is: " + input.substring(0, input.indexOf(' ')));
 return input.substring(0, input.indexOf(' '));

 } 
else {

 System.out.println("The first word is: " + input);
 return input;
 }

 }
}

