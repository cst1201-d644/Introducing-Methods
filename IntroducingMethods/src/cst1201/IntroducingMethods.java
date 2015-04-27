package cst1201;

import java.util.Scanner;

/**
 *
 * @author Sameen Qaiser
 */
public class IntroducingMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO: Fill in the body with your code
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the string: ");
        getInputString(keyboard);
    }

    private static String getInputString(Scanner inScanner) {
        // TODO: Fill in the body
        String s = inScanner.nextLine();
        if (s.length() > 0) {
            getWordCount(s);
        } else {
            System.out.println("ERROR - string can not be empty.");
            System.out.print("Enter the string: ");
            s = inScanner.nextLine();
            getWordCount(s);

        }

        return s;
    }

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

        System.out.println(counter);
        return counter;
    }

    private static String getFirstWord(String input) {
        String arr[] = input.split(" ");
        String firstWord = arr[0];
        System.out.println("The first word is :" + firstWord);
        return input;
    }
}
