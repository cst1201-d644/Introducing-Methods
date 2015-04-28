package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author TODO: razia and jean.
 */
public class IntroducingMethods {

    public static void main(String[] args) {

        System.out.print("Please enter a string: ");

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
            getFirstWord(input);

        }

        getWordCount(input);
        getFirstWord(input);

        return input;

    }

    private static int getWordCount(String input) {

        int wordCount = input.split(" ").length;

        System.out.println("Your string has " + wordCount + " words in it");

        return wordCount;

    }

    private static String getFirstWord(String input) {

        if (input.indexOf(' ') > -1) {

            System.out.println("The First Word is: " + input.substring(0, input.indexOf(' ')));
            return input.substring(0, input.indexOf(' '));

        } else {

            System.out.println("The First Word is: " + input);
            return input;
        }

    }

}
