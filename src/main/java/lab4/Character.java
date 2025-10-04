package lab4;
import lab4.strategy.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickstrategy;

    public boolean isAlive() {
        return hp > 0;
    }

public void kick(Character enemy) {
    kickstrategy.kick(this, enemy);
}
}
