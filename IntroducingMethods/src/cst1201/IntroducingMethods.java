package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author TODO: Your name here.
 */
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

        }

        getWordCount(input);

        return input;

    }

    private static int getWordCount(String input) {

        int wordCount = input.split(" ").length;

        System.out.println("Your string has " + wordCount + " words in it");

        return wordCount;

    }

}
