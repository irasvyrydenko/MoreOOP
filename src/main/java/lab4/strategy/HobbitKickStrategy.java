package lab4.strategy;
import lab4.Character;

public class HobbitKickStrategy extends KickStrategy {
   public HobbitKickStrategy() {
   }
    public void kick(Character main, Character enemy) {
        System.out.println("Cry a lot!");
    }
}
