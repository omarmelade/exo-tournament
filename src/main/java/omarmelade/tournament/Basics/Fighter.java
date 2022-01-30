package omarmelade.tournament.Basics;

import omarmelade.tournament.Fight;

import java.util.Objects;

abstract public class Fighter {

    private int hitPoints;
    private Weapon weapon;
    private Defend def;
    private Armor armor;
    private final String name;

    private Fight fight;

    public Fighter(String name, int hitPoints,  Weapon w) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.weapon = w;
        this.def = null;
    }


    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setDef(Defend def) {
        this.def = def;
    }

    public void engage(Fighter f)
    {
        fight = new Fight(this, f);
        fight.fighting();
    }

    public int hitPoints() {
        return hitPoints;
    }

    public void removeHitPoints(int dmg) {
        if(dmg < 0)
            dmg = 0;
        int removedPoints = hitPoints() - dmg;
        setHitPoints(Math.max(removedPoints, 0));
    }


    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean alive() {
        return hitPoints() > 0;
    }

    public void hit(Fighter f) {
        boolean armored = this.armor != null;

        f.receiveHit(this.weapon, armored);
    }

    public void receiveHit(Weapon w, boolean armored)
    {
        int dmg = w.attack();

        // armor is heavy
        if (armored)
            dmg -= 1;

        if (this.armor != null)
            dmg -= 3;

        if( this.def == null ) {
            removeHitPoints(dmg);
        }else{

            System.out.println(this.name + " Before Parry : " + dmg);
            int parryRes = this.def.parryHit(w, dmg);
            System.out.println(this.name + " Receive : " + parryRes);
            removeHitPoints(parryRes);

        }
    }

    @Override
    public String toString() {
        return name + " as : " + hitPoints() + " hitPoints \n";
    }

    public abstract Fighter equip(String buckler);
}
