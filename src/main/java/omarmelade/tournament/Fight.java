package omarmelade.tournament;

import omarmelade.tournament.Basics.Fighter;

public class Fight {

    private Fighter f1, f2;

    public Fight(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public void fighting()
    {
        int round = 1;
        while(f1.alive() && f2.alive())
        {
            System.out.println(f1.alive() + " " + f1.alive());
            System.out.println("Round "+ round + "\n" + "    " + f1.toString() + "    "+ f2.toString());

            f1.hit(f2);
            f2.hit(f1);
            round++;
        }
        System.out.println(f1.alive() + " " + f1.alive());
        System.out.println("Round "+ round + "\n" + "    " + f1.toString() + "    "+ f2.toString());
    }

}
