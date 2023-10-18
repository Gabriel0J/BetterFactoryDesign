import java.util.Random;

public class AlienFactory {
    enum alienTypes {MONKEY,RAT,SQUID,TIGER}
    private static Random randomVal = new Random();
    public Alien getAlien() {
        int randomIndex = randomVal.nextInt(AlienFactory.alienTypes.values().length);
        alienTypes chosenType = AlienFactory.alienTypes.values()[randomIndex];
        switch (chosenType) {
            case MONKEY:
                return new MonkeyAlien();
            case RAT:
                return new RatAlien();
            case SQUID:
                return new SquidAlien();
            case TIGER:
                return new TigerAlien();
            default:
                System.out.println("Unknown Alien");
                return null;
        }
    }
}
