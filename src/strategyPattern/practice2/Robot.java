package strategyPattern.practice2;


public abstract class Robot {

    Attackable attackable;
    Moveable moveable;

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }

    public void setMoveable(Moveable moveable) {
        this.moveable = moveable;
    }

    public void performAttack() {
       attackable.attack();
    }
}

