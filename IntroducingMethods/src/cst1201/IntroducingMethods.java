input = inScanner.nextLine();
 getWordCount(input);
 getFirstWord(input);

}
 System.out.println("Which number of words do you want to get?: ");

 int n = inScanner.nextInt();

getWordCount(input);
 getFirstWord(input);

 getWord(input, n);
return input;
 private static int getWordCount(String input) {
}
 private static String getFirstWord(String input) {

 if (input.indexOf(' ') > -1) {

 System.out.println("The first word is: " + input.substring(0, input.indexOf(' ')));
 return input.substring(0, input.indexOf(' '));

 } else {

 System.out.println("The first word is: " + input);
 return input;
 }
 private static String getWord(String input, int n) {
 String arr[] = input.split(" ");
 String word = arr[n];
 System.out.println("The word you searched: " + word);
 return word;
}
}
