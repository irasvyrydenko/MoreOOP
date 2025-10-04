package lab4;

import lab4.strategy.ElfKickStrategy;

public class Elf extends Character {
    public Elf() {
        super(10,10, new ElfKickStrategy());
    }

}

