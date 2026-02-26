import java.util.Scanner;

public class GameController {
    private final Scanner scanner;
    private final WordBank wordBank;

    public GameController() {
        this.scanner = new Scanner(System.in);
        this.wordBank = new WordBank();
    }

    public void start() {
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        
        HangmanArt.printWelcomeBanner(name);

        boolean isOpen = true;
        while (isOpen) {
            System.out.println("""
                    
                    1. Start the Game
                    2. Exit
                    """);
            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Fetch a word and start a new round
                String randomWord = wordBank.getRandomWord();
                GameSession session = new GameSession(randomWord);
                session.play(scanner);
                
            } else if (choice == 2) {
                System.out.println("Exit...");
                isOpen = false;
            } else {
                System.out.println("Invalid Choice, Try again");
            }
        }
        scanner.close();
    }
}