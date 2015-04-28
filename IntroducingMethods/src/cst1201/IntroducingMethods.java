package cst1201;

import java.util.Scanner;

/**
 * Given a string, the program will return the number of words in the string. It
 * will also then return the first word of that string along with the 'nth' word
 * of the string.
 *
 * @author TODO: Winnie Wu & Kenny Tsang
 */
public class IntroducingMethods {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);

        getInputString(scanner);
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

        String inputString = inScanner.nextLine();

        while (inputString.length() == 0){
            System.out.println("ERROR - string must not be empty.");
            System.out.print("Enter a string: ");
            inputString = inScanner.nextLine();           
        }
        System.out.print("What number word would you like to extract? ");
        int n = inScanner.nextInt();
        
        getWordCount(inputString);
        getFirstWord(inputString);
        getWord(inputString, n);
               
        return inputString;
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

        int count = input.split(" ").length;
        System.out.println("Your string has " + count + " words in it.");

        return count;
    }

    private static String getFirstWord(String input) {

        String array[] = input.split(" ");
        String firstWord = array[0];

        System.out.println("The first word is: " + firstWord);

        return input;
    }
    
    private static String getWord(String input, int n){
        
        String array[] = input.split(" ");
        String word = array[n];
        
        System.out.println("The word chosen is: " + word);
        
        return input;
    }
   
}
