package omarmelade.tournament.Basics;

import java.util.Objects;

public class Defend {

    private int durability;
    private final String name;
    private boolean blockLastHit;


    public Defend(String name, int durability) {
        this.durability = durability;
        this.name = name;
    }

    public int parryHit( Weapon w, int dmg )
    {
        int hitPointToRemove = 0;

        System.out.println();

        if (!this.isBlockLastHit() && this.getDurability() > 0) {

            this.setBlockLastHit(true);

            if(Objects.equals(w.getName(), "Axe")){
                this.setDurability(this.getDurability() - 1);
            }
            System.out.println("parade");

            if(w.getCooldown() == 0){
                this.setBlockLastHit(false);
                System.out.println("parade 2");
            }
        }

        else if ( this.isBlockLastHit() || this.getDurability() == 0)
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
