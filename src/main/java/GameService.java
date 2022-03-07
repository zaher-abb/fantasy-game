import java.util.Random;

public class GameService {


    public Troll createTroll() {
        return new Troll(getRandomNumber(),getRandomNumber(),getRandomNumber());
    }
    private int getRandomNumber(){
        return new Random().nextInt(10) + 1;
    }
    public Wizard createWizard() {
        return new Wizard(getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber());
    }


    public void attack(Creature attacker, Creature defender) {
        defender.setHealth(defender.getHealth()-attacker.getStrength());
    }
}

