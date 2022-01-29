package omarmelade.tournament;

abstract public class Weapon {

    private final int dmg;
    private final String name;

    public Weapon(int dmg, String name) {



        this.dmg = dmg;
        this.name = name;
    }



    public int attack() { return dmg(); }

    public int dmg() {
        return dmg;
    }
}
