package lab4;

import java.util.Random;

import lab4.strategy.NobleKickStrategy;

public class Noble extends Character {
    private static final Random RANDOM = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(new Random().nextInt(maxPower-minPower)+minPower,new Random().nextInt(maxHp-minHp)+minHp, new NobleKickStrategy());
    }
    @Override
    public void kick(Character enemy) {
        int enemy_hp = enemy.getHp();
        enemy.setHp(enemy_hp-RANDOM.nextInt(getPower()));
    }
}
