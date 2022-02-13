package strategyPattern.practice;

public  class  Champion{

    Attackable attackable;
    Defendable defendable;
    Moveable moveable;


    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

    public void setDefendable(Defendable defendable) {
        this.defendable = defendable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public void performAttack() {
        attackable.attack();
    }
    public void performDefend(){
        defendable.defend();
    }
    public void performMove(){
        moveable.move();
    }

}
