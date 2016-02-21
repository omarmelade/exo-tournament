package com.nespresso.sofa.recruitement;

import org.junit.Test;

public class GreatTournamentTest {


    /**
     * A Swordsman has 100 hitpoint and use a 1 hand sword that does 5 dmg
     * An Axeman has 120 hitpoint and use a 1 hand axe that does 6 dmg
     */
    @Test
    private void round1(){

        Swordsman swordsman = new Swordsman();
        Axeman axeman = new Axeman();

        swordsman.engage(axeman);

        assertThat(swordsman.hitpoints())

    }


    // swordman vs noble
    // basic fight mechanic

    // poisoned dagger 2 first blow triple damages
    // add state on the weapon

    // bucker one time ot of 2 cancel all the damages of a blow ; destroy after blocking 3 blow from an axe
    // change fighting behavior

    // equipe armor : reduce all damages by 2 & reduce attack rythm to 2 every 3 round








}
