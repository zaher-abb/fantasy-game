import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestVideoGame {

    private final GameService gameService = new GameService();
    private Wizard wizard;
    private Troll troll;

    @BeforeEach
    public void setup(){
        wizard = gameService.createWizard();
        troll = gameService.createTroll();
    }
    @Test
    public void shouldCreateTroll(){
        assertInstanceOf(Troll.class,gameService.createTroll());
    }

    @Test
    public void shouldCreateWizard(){
        assertInstanceOf(Wizard.class,gameService.createWizard());
    }
    @Test
    public void shouldValuesBeBetweenOneAndTen(){
        assertTrue(wizard.getArmour()<11 && wizard.getArmour() > 0);
        assertTrue(wizard.getHealth()<11 && wizard.getHealth() > 0);
        assertTrue(wizard.getIntellect()<11 && wizard.getIntellect() > 0);
        assertTrue(wizard.getStrength()<11 && wizard.getStrength() > 0);
    }
    @Test
    public void shouldValuesBeBetweenOneAndTenAndIntellectIsOne(){
        assertTrue(troll.getArmour()<11 && troll.getArmour() > 0);
        assertTrue(troll.getHealth()<11 && troll.getHealth() > 0);
        assertEquals(1, troll.getIntellect());
        assertTrue(troll.getStrength()<11 && troll.getStrength() > 0);
    }
    @Test
    public void shouldDecreasesTheHealthOfAttacker(){
        int expectedHealth=troll.getHealth()-wizard.getStrength();
        gameService.attack(wizard,troll);
        assertEquals(expectedHealth,troll.getHealth());
    }


}
