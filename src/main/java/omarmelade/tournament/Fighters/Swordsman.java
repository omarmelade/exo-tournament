package omarmelade.tournament.Fighters;

import omarmelade.tournament.Basics.Armor;
import omarmelade.tournament.Basics.Defend;
import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.FighterObjects.Sword;

import java.util.Objects;

public class Swordsman extends Fighter {

    public Swordsman()
    {
        super("Swordsman", 100, new Sword());
    }

    @Override
    public Swordsman equip(String weapon) {
        if(Objects.equals(weapon, "buckler"))
            this.setDef(new Defend("buckler", 3));
        else
            this.setArmor(new Armor("Armor", 3, 1));
        return this;
    }
}
