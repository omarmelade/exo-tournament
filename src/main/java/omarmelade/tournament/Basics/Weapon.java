package omarmelade.tournament.Basics;

abstract public class Weapon {

    private int dmg;
    private final String name;
    private int cooldown = -1;

    public Weapon(int dmg, String name) {
        this.dmg = dmg;
        this.name = name;
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
