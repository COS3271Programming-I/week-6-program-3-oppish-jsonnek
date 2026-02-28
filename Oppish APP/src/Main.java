// Jonathan Sonnek
// 2/27/26
// Oppish APP

import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);

    // Method to check if a character is a vowel
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y');
    }
    public static void main(String[] args) {
        // Get a sentence from the user
        System.out.println("Enter a sentence:");
        String sentence = userInput.nextLine();
        StringBuilder oppishSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (i+1 < sentence.length() && !isVowel(c) && isVowel(sentence.charAt(i+1)) && Character.isLetter(c)) {
                oppishSentence.append(c).append("opp");
            }
            else {
                oppishSentence.append(c);
            }
        }

        System.out.println(oppishSentence.toString());
    }
}