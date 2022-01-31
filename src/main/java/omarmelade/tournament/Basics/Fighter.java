package omarmelade.tournament.Basics;

import omarmelade.tournament.Fight;
import omarmelade.tournament.FighterObjects.Armor;
import omarmelade.tournament.FighterObjects.Buckler;

import java.util.Objects;

abstract public class Fighter {

    private int intialPV;
    private int hitPoints;
    private Weapon weapon;
    private Buckler def;
    private Armor armor;
    private final String name;
    private String type;
    private boolean typeActive = false;

    private Fight fight;

    public Fighter(String name, int hitPoints,  Weapon w) {
        this.intialPV = hitPoints;
        this.name = name;
        this.hitPoints = hitPoints;
        this.weapon = w;
        this.def = null;
    }


    public Fighter(String name, int hitPoints) {
        this.intialPV = hitPoints;
        this.name = name;
        this.hitPoints = hitPoints;
        this.weapon = null;
        this.def = null;
    }

    public String getType() {
        return type;
    }

    public void setType(String attr) {
        this.type = attr;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setDef(Buckler def) {
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
        Blow b = new Blow(this.weapon, this);
        f.receiveHit( this, this.weapon, armored);
    }

    public void receiveHit(Fighter f, Weapon w, boolean armored)
    {
        int dmg = w.attack();
        if(Objects.equals(w.getEffect(), "poison") && w.getBlow() > 0)
        {
            dmg += 20;
            w.setBlow(w.getBlow() - 1);
        }

        if(f.typeActive){
            dmg -= 2;
        }

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

    public Buckler getDef()
    {
        return this.def;
    }
}
