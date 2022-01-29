package omarmelade.tournament;

public class Viking extends Fighter {

    public Viking(){
        super("Viking",120, new Axe());
    }

    @Override
    public Viking equip(String buckler) {
        return null;
    }
}
