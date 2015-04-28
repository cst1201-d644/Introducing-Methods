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

    private static String getInputString(Scanner inScanner) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = in.nextLine();
        if (inputString.length() > 0) {
            System.out.println("you just entered" + inputString);
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
        System.out.println("Amount of word that you entered:"+ count);
        return count;
    }

    private static String getFirstWord(String input) {
        if (input.indexOf(' ') > -1) {
            System.out.println("First word is" +input);
            return input.substring(0, input.indexOf(' '));
        } else {
            return input;
        }

    }

    private static String getWord(String input, int n) {
        
       return input;
        

    }

}
