package omarmelade.tournament;

import omarmelade.tournament.Fighters.Swordsman;
import omarmelade.tournament.Fighters.Viking;

public class Tournament {

    public static void main(String[] args) {
        Swordsman swordsman = new Swordsman();

        Viking viking = new Viking();

        swordsman.engage(viking);
    }
}
