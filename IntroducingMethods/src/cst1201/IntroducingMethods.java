import java.util.Scanner;

 private static String getInputString(Scanner inScanner) {
input = inScanner.nextLine();
getWordCount(input);
+ getFirstWord(input);
}
getWordCount(input);
+ getFirstWord(input);
return input;
private static int getWordCount(String input) {
}
+ private static String getFirstWord(String input) {
+
+ if (input.indexOf(' ') > -1) {
+
+ System.out.println("The first word is: " + input.substring(0, input.indexOf(' ')));
+ return input.substring(0, input.indexOf(' '));
+
+ } else {
+
+ System.out.println("The first word is: " + input);
+ return input;
+ }
+
+ }
+
}
