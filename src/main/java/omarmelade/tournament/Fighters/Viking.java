package omarmelade.tournament.Fighters;

import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.Weapons.Axe;

public class Viking extends Fighter {

    public Viking(){
        super("Viking",120, new Axe());
    }

    @Override
    public Viking equip(String buckler) {
        return null;
    }
}
