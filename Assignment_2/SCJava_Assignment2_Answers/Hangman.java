// This program plays hangman game.
// Users see a dashed word, trying to
// correctly figure the un-dashed word out
// by inputting one character each round.
// If the user input is correct, show the
// updated word on console. Players have N_TURNS
// chances to try and win this game.

import java.util.*;

public class Hangman{

    // The randomly chosen word for the game (constant)
    public static final String ANS = getRandomWord(); 
    public static int tries = 7; // Maximum wrong guesses allowed
    public static void main(String[] args){

        String answer = hideAnswer(ANS); // Convert the answer into hidden format (e.g., "----")
        Set<Character> guessedLetters = new HashSet<>(); // Store guessed letters to prevent duplicates

        System.out.println("The word looks like " + answer);
        System.out.println("You have " + tries + " wrong guesses left");

        Scanner guessScanner = new Scanner(System.in);

        while (tries>0){
            System.out.print("Your guess: ");
            String input = guessScanner.nextLine().toUpperCase(); // Convert input to uppercase for case-insensitive comparison

             // Check for invalid input (must be a single letter)
            if (input.length() > 1 || !Character.isLetter(input.charAt(0))){
                System.out.println("Illegal format.");
                continue; // Ask for input again
            } else {

                char guess = input.charAt(0);

                // Check if the letter has already been guessed
                if (guessedLetters.contains(guess)){
                    System.out.println("You've already guessed that letter.");
                    continue; // Skip to the next iteration
                }
                
                guessedLetters.add(guess);

                // Check if the guessed letter is in the answer
                if (ANS.indexOf(guess) != -1){
                    answer = updateWord(answer, guess);
                    System.out.println("You are correct!");  
                } else {
                    tries --; // Reduce remaining attempts on incorrect guess
                    System.out.println("There is no " + guess + "'s in the word.");       
                }

                System.out.println("The word looks like " + answer); 
                System.out.println("You have " + tries + " wrong guesses left");    

                // If no "-" remains, player has guessed the full word
                if (!answer.contains("-")) {
                    System.out.println("You win!!");
                    System.out.println("The word was: " + ANS);
                    return; // Exit the game
                }
            }
        }
        // Player loses if all attempts are used up
        System.out.println("You are completely hung :(");
        System.out.println("The word was: " + ANS);
    }

    // Generates a random word from the predefined list
    public static String getRandomWord() {
        Random random = new Random();
        int num = random.nextInt(9);
        
        switch (num) {
            case 0: return "NOTORIOUS";
            case 1: return "GLAMOROUS";
            case 2: return "CAUTIOUS";
            case 3: return "DEMOCRACY";
            case 4: return "BOYCOTT";
            case 5: return "ENTHUSIASTIC";
            case 6: return "HOSPITALITY";
            case 7: return "BUNDLE";
            case 8: return "REFUND";
            default: return ""; // This case should never happen
        }
    }

    // Converts the word into a hidden format (e.g., "BUNDLE" → "------")
    public static String hideAnswer(String randomWord){
        String result = randomWord.replaceAll("[a-zA-Z]", "-");
        return result;
    }

    // Updates the displayed word by replacing "-" with correctly guessed letters
    public static String updateWord(String answer, char guess){
        StringBuilder newWord = new StringBuilder(answer);
        for (int i=0; i<ANS.length(); i++){
            if (ANS.charAt(i)==guess){
                newWord.setCharAt(i, guess);
            }
        }
        return newWord.toString();
    }
}