package omarmelade.tournament.Basics;

abstract public class Weapon {

    private int dmg;
    private final String name;
    private int cooldown = -1;
    private String effect = null;
    private int blow = 0;

    public Weapon(int dmg, String name) {
        this.dmg = dmg;
        this.name = name;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    public void setBlow(int blow) {
        this.blow = blow;
    }

    public int getBlow() {
        return blow;
    }

    public String getName() {
        return name;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int attack() { return dmg(); }

    public int dmg() {
        return dmg;
    }
}
