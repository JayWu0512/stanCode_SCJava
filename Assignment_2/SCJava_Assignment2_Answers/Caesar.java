// This program demonstrates the idea of caesar cipher.
// Users will be asked to input a number to produce shifted
// ALPHABET as the cipher table. After that, any strings typed
// in will be encrypted.

import java.util.*;

public class Caesar{

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);
        Scanner cipherScanner = new Scanner(System.in);

        System.out.print("Secret number: ");
        int secretNumber = numberScanner.nextInt();

        System.out.print("What's the ciphered string? ");
        String cipheredString = cipherScanner.nextLine().toUpperCase();  

        // Decipher the string
        String decipherString = decipher(secretNumber, cipheredString);
        
        System.out.print("The deciphered string is: " + decipherString);
    }

    public static String decipher(int secretNumber, String cipheredString){

        // Shift ALPHABET to create a new mapping
        String newAlphabet = ALPHABET.substring(26-secretNumber) + ALPHABET.substring(0, 26-secretNumber);
        StringBuilder decipherString = new StringBuilder();

        // Map each character back to the original ALPHABET
        for (int i=0; i<cipheredString.length(); i++){
            char ch = cipheredString.charAt(i);
            if (ALPHABET.indexOf(ch) != -1){
                int index = newAlphabet.indexOf(ch);
                decipherString.append(ALPHABET.charAt(index));
            } else {
                decipherString.append(ch);
            }
        }
        return decipherString.toString();
    }
}