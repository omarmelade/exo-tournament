package omarmelade.tournament.Fighters;

import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.Weapons.Sword;

public class Swordsman extends Fighter {

    public Swordsman()
    {
        super("Swordsman", 100, new Sword());
    }

    @Override
    public Swordsman equip(String buckler) {
        return null;
    }
}
