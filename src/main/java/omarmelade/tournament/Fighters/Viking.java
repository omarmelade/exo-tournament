package omarmelade.tournament.Fighters;

import omarmelade.tournament.FighterObjects.Buckler;
import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.FighterObjects.Axe;

public class Viking extends Fighter {

    public Viking(){
        super("Viking",120, new Axe());
    }

    @Override
    public Viking equip(String buckler) {
        this.setDef(new Buckler("buckler", 3));

        return this;
    }
}
