package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author TODO: Evan Chin
 */
public class IntroducingMethods {

    public static void main(String[] args) {
        // TODO: Fill in the body with your code
        // Given a Scanner, prompt the user for a String.  If the user enters an empty
        // String, report an error message and ask for a non-empty String.  Return the
        // String to the calling program.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        Scanner str = new Scanner(System.in);
        getInputString(str);
    }

    private static String getInputString(Scanner inScanner) {
        // TODO: Fill in the body
        // NOTE: Do not declare a Scanner in the body of this method.
        String inputString = inScanner.nextLine();
        if (inputString.length() == 0) {
            System.out.println("Error - string must not be empty. ");
            System.out.println("Please enter a string: ");
            inputString = inScanner.nextLine();
        }
        
        getWordCount(inputString);
        getFirstWord(inputString);

        return inputString;
    }
    // Given a String return the number of words in the String.  A word is a sequence of 
    // characters with no spaces.  Write this method so that the function call:
    // int count = getWordCount("The quick brown fox jumped");
    // results in count having a value of 5.  You will call this method from the main method.
    // For this assignment you may assume that
    // words will be separated by exactly one space.

    private static int getWordCount(String input) {
        // TODO: Fill in the body
        int wordCount = input.split(" ").length;
        System.out.println("Your string has " + wordCount + " words in it.");

        return wordCount;
    }

    private static String getFirstWord(String input) {
        String arr[] = input.split(" ");
        String firstWord = arr[0];
        System.out.println("The first word is :" + firstWord);

        return input;
    }
    }
