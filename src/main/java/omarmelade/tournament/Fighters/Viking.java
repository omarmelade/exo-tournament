package omarmelade.tournament.Fighters;

import omarmelade.tournament.Basics.Defend;
import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.FighterObjects.Axe;

public class Viking extends Fighter {

    public Viking(){
        super("Viking",120, new Axe());
    }

    @Override
    public Viking equip(String buckler) {
        this.setDef(new Defend("buckler", 3));

        return this;
    }
}
