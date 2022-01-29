package omarmelade.tournament.Basics;

import omarmelade.tournament.Fight;

abstract public class Fighter {

    private int hitPoints;
    private final Weapon rightH;
    private final Weapon leftH;
    private final String name;

    private Fight fight;

    public Fighter(String name, int hitPoints, Weapon rightH) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.rightH = rightH;
        this.leftH = null;
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
        int removedPoints = hitPoints() - dmg;
        setHitPoints(Math.max(removedPoints, 0));
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean alive() {
        return hitPoints() > 0;
    }

    public void hit(Fighter f) {f.receiveHit(this.rightH.attack());}

    public void receiveHit(int dmg)
    {
        removeHitPoints(dmg);
    }

    @Override
    public String toString() {
        return name + " as : " + hitPoints() + " hitPoints \n";
    }

    public abstract Fighter equip(String buckler);
}
