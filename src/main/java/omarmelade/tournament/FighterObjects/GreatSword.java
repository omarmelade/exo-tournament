package omarmelade.tournament.FighterObjects;

import omarmelade.tournament.Basics.Weapon;

public class GreatSword extends Weapon {

    public GreatSword() {
        super(12, "Great Sword");
        this.setCooldown(0);
    }


    @Override
    public int attack() {
        int dmg = super.attack();
        if(this.getCooldown() < 2)
        {
            this.setCooldown(this.getCooldown() + 1);

        }else if (this.getCooldown() == 2){
            this.setCooldown(0);
            System.out.println("no attack");
            dmg = 0;
        }
        return dmg;
    }
}
