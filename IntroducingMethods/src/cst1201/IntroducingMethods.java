package cst1201;

import java.util.Scanner;

/**
 * Description of your class.
 *
 * @author Francisco Latacela and Goutam Kundu .
 */
public class IntroducingMethods {

    public static void main(String[] args) {

        //Fill in the body with your code
        System.out.println("Please Enter a String: ");
        Scanner sc = new Scanner(System.in);
        getInputString(sc);
    }

    /**
     * Given a Scanner, prompts the user for a String. If the user enters an
     * empty String, reports an error message and asks for a non-empty String.
     * Returns the String to the calling program.
     *
     * @param inScanner The Scanner to use to prompt the user.
     * @return The resulting String from the user.
     */
    private static String getInputString(Scanner inScanner) {
        //Fill in the body
        String input = inScanner.nextLine();
        while (input.length() == 0) {
            System.out.println("You have entered an empty String, Please enter a non-empty String");
            System.out.println("Please Enter a String: ");
            input = inScanner.nextLine();
        }
        getWordCount(input);
        return input;
    }

    /**
     * Given a String, returns the number of words in the String. A word is a
     * sequence of characters with no spaces. For example, the method call:
     * <pre>
     *      int count = getWordCount("The quick brown fox jumped");
     * </pre> results in count having a value of 5. This method should be called
     * from the main method. For this assignment, you may assume that words will
     * be separated by exactly one space.
     *
     * @param input The String in question.
     * @return The number of words in the String. Each word is separated by a
     * single space.
     */
    private static int getWordCount(String input) {
        //Fill in the body
        int countingWords = input.split(" ").length;

        System.out.println("Your string contain " + countingWords + " words!");
        System.out.println("The First Word is: " + firstWordDisplayed(input));

        return countingWords;
    }

    //It will display the first letter of the string inputted 
    private static String firstWordDisplayed(String input) {
        int CountingSpace = 0;
        char word[] = input.toCharArray();
        for (int i = 0; i < word.length; i++) {
            if (word[i] == ' ') {
                CountingSpace = i;
                break;
            }
        }
        String firstWord = input.substring(0, CountingSpace);
        return firstWord;

    }
}
