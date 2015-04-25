package cst1201;

import java.util.Scanner;

/**
 * CST 1201
 *
 * @author JianLang Lin,Ziying Guo
 */
public class IntroducingMethods {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");

        getInputString(keyboard);
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
        String s = inScanner.nextLine();
        if (s.length() > 0) {
            getWordCount(s);
            getFirstWord(s);
             } 
        else {
            System.out.println("ERROR - string must not be empty.");
            System.out.print("Enter a string: ");
            s = inScanner.nextLine();
            getWordCount(s);
            getFirstWord(s);
            
        }

        return s;
    }

    /**
     * Given a String, returns the number of words in the String. A word is a
     * sequence of characters with no spaces. For example, the method call:
     *
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
        int counter = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            if (Character.isLetter(input.charAt(i))) {
                counter++;
                for (; i <= input.length() - 1; i++) {
                    if (input.charAt(i) == ' ') {
                        counter++;
                        i++;
                        while (input.charAt(i) == ' ') {
                            i++;
                        }
                    }
                }

            }

        }

        System.out.println("Your string has " + counter + " words in it.");
        return counter;

    }

    private static String getFirstWord(String input) {
        String arr[] = input.split(" ");
        String firstWord = arr[0];
        System.out.println("The first word is :" + firstWord);
        return input;
    }

  
    
}
