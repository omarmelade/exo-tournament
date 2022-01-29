package omarmelade.tournament;

public class Swordsman extends Fighter {

    public Swordsman()
    {
        super("Swordsman", 100, new Sword());
    }

    @Override
    public Swordsman equip(String buckler) {
        return null;
    }
}
