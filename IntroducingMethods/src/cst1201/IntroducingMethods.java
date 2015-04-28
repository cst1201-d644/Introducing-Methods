package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author TODO: razia and jean.
 */
public class IntroducingMethods {

    public static void main(String[] args) {

        System.out.print(" Please enter a string: ");

        Scanner keyboard = new Scanner(System.in);
        getInputString(keyboard);
    }

    // Given a Scanner, prompt the user for a String.  If the user enters an empty
    // String, report an error message and ask for a non-empty String.  Return the
    // String to the calling program.
    private static String getInputString(Scanner inScanner) {
        // TODO: Fill in the body

        // NOTE: Do not declare a Scanner in the body of this method.
        String input = inScanner.nextLine();

        while (input.length() == 0) {

            System.out.println("ERROR - string must not be empty.");
            System.out.println(" Please enter a string: ");

            input = inScanner.nextLine();

            getWordCount(input);

        }

        getWordCount(input);

        return input;
    }

    // Given a String return the number of words in the String.  A word is a sequence of 
    // characters with no spaces.  Write this method so that the function call:
    // 		int count = getWordCount("The quick brown fox jumped");
    // results in count having a value of 5.  You will call this method from the main method.
    // For this assignment you may assume that
    // words will be separated by exactly one space.
    private static int getWordCount(String input) {
        // TODO: Fill in the body
        int wordCount = input.split(" ").length;

        System.out.println("Your string has " + wordCount + " words in it");

        return wordCount;

    }
}
