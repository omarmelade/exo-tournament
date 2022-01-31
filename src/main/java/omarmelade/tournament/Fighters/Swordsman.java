package omarmelade.tournament.Fighters;

import omarmelade.tournament.FighterObjects.Armor;
import omarmelade.tournament.FighterObjects.Buckler;
import omarmelade.tournament.Basics.Fighter;
import omarmelade.tournament.FighterObjects.Axe;
import omarmelade.tournament.FighterObjects.Sword;

import java.util.Objects;

public class Swordsman extends Fighter {

    public Swordsman()
    {
        super("Swordsman", 100, new Sword());
    }

    public Swordsman(String attr)
    {
        super("Swordsman", 100);
        this.setType(attr);
    }

    @Override
    public Swordsman equip(String weapon) {
        if(Objects.equals(weapon, "buckler")) {
            this.setDef(new Buckler("buckler", 3));
        }
        else if(Objects.equals(weapon, "armor")) {
            this.setArmor(new Armor("Armor", 3, 1));
        }
        else if(Objects.equals(weapon, "axe")) {
            this.setWeapon(new Axe());
            if (Objects.equals(this.getType(), "Vicious"))
                this.getWeapon().setEffect("poison");
                this.getWeapon().setBlow(2);
        }

        return this;
    }
}
