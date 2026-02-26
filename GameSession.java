import java.util.ArrayList;
import java.util.Scanner;

public class GameSession {
    private final String targetWord;
    private final char[] currentGuessState;
    private int triesLeft;
    private final ArrayList<Character> guessedChars;

    public GameSession(String word) {
        this.targetWord = word;
        this.triesLeft = 6;
        this.guessedChars = new ArrayList<>();
        this.currentGuessState = "_".repeat(word.length()).toCharArray();
    }

    public void play(Scanner scanner) {
        HangmanArt.printHangman(triesLeft);
        System.out.println(currentGuessState);

        while (triesLeft > 0 && new String(currentGuessState).contains("_")) {
            System.out.print("Guess a Character: ");
            char character = scanner.next().charAt(0);

            if (guessedChars.contains(character)) {
                System.out.println("You have guessed this character. Guess Again");
            } else {
                guessedChars.add(character);

                // Check if the letter is in the word
                if (targetWord.indexOf(character) >= 0) {
                    for (int x = 0; x < targetWord.length(); x++) {
                        if (targetWord.charAt(x) == character) {
                            currentGuessState[x] = character;
                        }
                    }
                    System.out.println(currentGuessState);
                } else {
                    triesLeft--;
                    System.out.println("You have " + triesLeft + " tries left, Guess Again!");
                    HangmanArt.printHangman(triesLeft);
                }
            }
        }

        // Determine Win or Loss
        if (triesLeft != 0) {
            System.out.println("CONGRATULATIONS, YOU WON 1000$!");
        } else {
            System.out.println("YOU LOST, GO TO HELL!");
            System.out.println("The word was: " + targetWord);
        }
    }
}