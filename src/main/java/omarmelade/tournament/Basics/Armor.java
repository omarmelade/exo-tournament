package omarmelade.tournament.Basics;

public class Armor {

    private final int reducedDommage;
    private final int reducedAttack;
    private final String name;

    public Armor( String name, int reducedDommage, int reducedAttack) {
        this.reducedDommage = reducedDommage;
        this.reducedAttack = reducedAttack;
        this.name = name;
    }
}
