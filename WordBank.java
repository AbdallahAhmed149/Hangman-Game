import java.util.Random;

public class WordBank {
    private final String[] words = { 
        "layer", "orange", "play", "adventure", "bookshelf", "guitar", "umbrella", 
        "mountain", "mystery", "algorithm", "database", "interface", "compiler", "variable", "network", 
        "gravity", "telescope", "electron", "velocity", "quantum", "galaxy", "strategy", "marketing", 
        "revenue", "startup", "finance", "delivery" 
    };
    private final Random random;

    public WordBank() {
        this.random = new Random();
    }

    public String getRandomWord() {
        int index = random.nextInt(words.length);
        return words[index];
    }
}