import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Creature {
    private int strength;
    private int intellect;
    private int armour;
    private int health;
}
