package omarmelade.tournament.Fighters;

import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.Basics.Weapon;
import omarmelade.tournament.FighterObjects.GreatSword;

public class Highlander extends Fighter {


    public Highlander() {
        super("Highlander", 150, new GreatSword());
    }

    @Override
    public Fighter equip(String buckler) {
        return this;
    }
}
