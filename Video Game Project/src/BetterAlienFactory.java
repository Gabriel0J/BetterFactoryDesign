import java.util.Random;

public class BetterAlienFactory {
    enum Types {MonkeyAlien,RatAlien,SquidAlien,TigerAlien}
    private static Random randomVal = new Random();
    public Alien getAlien() {
        int randomIndex = randomVal.nextInt(Types.values().length);
        Types t = Types.values()[randomIndex];
        Alien alien = null;
        try {
            alien = (Alien)(Class.forName(t.toString()).getDeclaredConstructor().newInstance()); //"long line of code"
        } catch (Exception e) {
            System.out.println("Unknown Alien Type");
        }
        return alien;
    }
    //Quiz Friday - Factory Design Pattern
    //Class similar to alien class
    //Make a factory- long line of code will be given
}