package cst1201;

import java.util.Scanner;

/**
 * TODO: Description of your class.
 *
 * @author TODO: Danish Khan and Dheyazen Alseelwe and Anu Alli.
 */
public class IntroducingMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = getInputString(sc);
        int length = input.length();

        if (length == 0) {
            System.out.print("ERROR - string must not be empty.");
        } else {
            
            System.out.println("Your string has " + getWordCount(input) + " words in it.");
            
            
            System.out.println("First word: " + getFirstWord(input));
        }

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
       
        // TODO: Fill in the body
         System.out.println("Enter a string: ");
        String input = inScanner.nextLine();
        return input;
        // NOTE: Do not declare a Scanner in the body of this method.
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
        int spaceCount = 1;
            for (char c : input.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }
            
            return spaceCount;

        // TODO: Fill in the body
    }
    
    
        private static String getFirstWord(String input){
            int firstSpace = 1;
            char c[] = input.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == ' ') {
                    firstSpace = i;
                    break;
                }
            }
            String firstWord = input.substring(0, firstSpace);
            
            return firstWord;
        }
}
