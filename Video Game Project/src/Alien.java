import java.util.Random;

public class Alien {
    private final String name;
    private static Random randomVal = new Random();
    public Alien(String type) {
        this.name = type + randomVal.nextInt(100);
        //type of alien + a 2-digit random number (0-99: doesn't include 100), duplicates can occur
    }
    public String getName() {
        return this.name;
    }
    @Override public String toString() {
        return this.name;
    }
}