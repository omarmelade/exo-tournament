package omarmelade.tournament.FighterObjects;

import omarmelade.tournament.Basics.Weapon;

import java.util.Objects;

public class Buckler {

    private int durability;
    private final String name;
    private boolean blockLastHit;


    public Buckler(String name, int durability) {
        this.durability = durability;
        this.name = name;
    }

    public int parryHit(Weapon w, int dmg )
    {
        int hitPointToRemove = 0;

        if(this.getDurability() == 0)
            return dmg;

        if (!this.isBlockLastHit()) {

            this.setBlockLastHit(true);

            if(w instanceof Axe){
                this.setDurability(this.getDurability() - 1);
            }

            if(w.getCooldown() == 0){
                this.setBlockLastHit(false);
            }
        }
        else if ( this.isBlockLastHit() )
        {
            this.setBlockLastHit(false);
            hitPointToRemove = dmg;
        }

        return hitPointToRemove;
    }



    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public boolean isBlockLastHit() {
        return blockLastHit;
    }

    public void setBlockLastHit(boolean blockLastHit) {
        this.blockLastHit = blockLastHit;
    }

}
