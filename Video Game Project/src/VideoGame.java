import java.util.Random;

public class VideoGame {
    private static final int ALIENGANG = 10;
    public void play() {
        BetterAlienFactory factory = new BetterAlienFactory();
        Alien[] aliens = new Alien[ALIENGANG];
        for (int i = 0; i < aliens.length; i++) {
            aliens[i] = factory.getAlien();
        }
        //"code for video game goes here"

        //prints aliens
        for (Alien alien : aliens) {
            System.out.println(alien);
        }
    }
}