public class HangmanArt {

    public static void printWelcomeBanner(String name) {
        System.out.println("WELCOME TO HANGMAN GAME, " + name);
        System.out.println("""
         _____________________________   
        /        _____________        \\
        | == .  |             |     o |  
        |   _   |    +---+    |    B  |  
        |  / \\  |    |   |    | A   O |  
        | | O | |    O   |    |  O    |  
        |  \\_/  |   /|\\  |    |       |  
        |       |   / \\  |    | . . . |  
        |  :::  |        |    | . . . |  
        |  :::  |  =========  | . . . |  
        |  :::  |_____________| . . . |  
        |         HANGMAN GAME        |  
        \\_____________________________/
        """);
    }

    public static void printHangman(int triesLeft) {
        switch (triesLeft) {
            case 6 -> System.out.println("""
                      +---+
                      |   |
                          |
                          |
                          |
                          |
                    =========
                      """);
            case 5 -> System.out.println("""
                      +---+
                      |   |
                      O   |
                          |
                          |
                          |
                    =========
                      """);
            case 4 -> System.out.println("""
                      +---+
                      |   |
                      O   |
                      |   |
                          |
                          |
                    =========
                      """);
            case 3 -> System.out.println("""
                      +---+
                      |   |
                      O   |
                     /|   |
                          |
                          |
                    =========
                      """);
            case 2 -> System.out.println("""
                      +---+
                      |   |
                      O   |
                     /|\\  |
                          |
                          |
                    =========
                      """);
            case 1 -> System.out.println("""
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    /    |
                         |
                     =========
                         """);
            case 0 -> System.out.println("""
                      +---+
                      |   |
                      O   |
                     /|\\  |
                     / \\  |
                          |
                    =========
                      """);
        }
    }
}