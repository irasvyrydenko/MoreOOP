package lab4;
import lab4.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    public Hobbit(){
        super(0,3, new HobbitKickStrategy());
    }
}
