package lab4.strategy;
import java.util.Random;

import lab4.Character;

public class NobleKickStrategy extends KickStrategy{
    private static final Random RANDOM = new Random();

    public NobleKickStrategy() {
    }

    public void kick(Character main, Character enemy) {
        int enemy_hp = enemy.getHp();
        enemy.setHp(enemy_hp-RANDOM.nextInt(main.getPower()));
    }
}
