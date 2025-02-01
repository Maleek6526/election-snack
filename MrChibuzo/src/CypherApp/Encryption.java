package CypherApp;

import java.util.InputMismatchException;
public class Encryption {

    public String getEncryption(String text, int number){
        try {
            char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            String modifiedText = text.replace(" ", "").replace("_", "");
            String modifiedTextAllCaps = modifiedText.toUpperCase();
            String encrypted = "";
            int digit = 0;
            for (int index = 0; index < modifiedTextAllCaps.length(); index++) {
                for (int character = 0; character < alphabets.length; character++) {
                    if ((alphabets[character]) == modifiedTextAllCaps.charAt(index)) {
                        digit = (character) + number;
                        encrypted += alphabets[digit];
                    }
                }

            }
            return encrypted;
        }
        catch (InputMismatchException exception){
            System.out.println("Enter correct input");
        }
        return "";
    }

    public String getDecryption(String text, int number){
        try {
            char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            String modifiedText = text.replace(" ", "").replace("_", "");
            String modifiedTextAllCaps = modifiedText.toUpperCase();
            String encrypted = "";
            int digit = 0;
            for (int index = 0; index < modifiedTextAllCaps.length(); index++) {
                for (int character = 0; character < alphabets.length; character++) {
                    if ((alphabets[character]) == modifiedTextAllCaps.charAt(index)) {
                        digit = (character) - number;
                        encrypted += alphabets[digit];
                    }
                }

            }
            return encrypted;
        }
        catch (InputMismatchException exception){
            System.out.println("Enter correct input");
        }
        return "";
    }
}
