package cst1201;

import java.util.Scanner;

/**
 * TODO: D644
 *
 * @author TODO: MingJie Huang
 */
public class IntroducingMethods {

    public static void main(String[] args) {

      
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
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        if (inputString.length() > 0) {
            return inputString;
            
        } else {
            System.out.println("ERROR - string must not be empty.");
            System.out.print("Enter a string: ");
            return getInputString(inScanner);
        }
    }

    
    private static int getWordCount(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }
    private static String getFirstWord(String input){
        return input;
    }
    private static String getWord(String input, int n){
        return input;
        
    }
            
}
   
