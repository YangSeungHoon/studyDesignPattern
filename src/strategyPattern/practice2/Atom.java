package strategyPattern.practice2;

public class Atom extends Robot{

    public Atom() {
        this.moveable = new Fly();
        this.attackable = new Punch();
    }

}
