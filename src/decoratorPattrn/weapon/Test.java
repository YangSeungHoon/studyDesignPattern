package decoratorPattrn.weapon;

public class Test {

    public static void main(String[] args) {

        Weapon weapon1 = new AR();
        weapon1.farming();
        weapon1 = new VerticalGrip(weapon1);

        weapon1.farming();


        Weapon weapon2 = new AngledGrip(new AR());
        weapon2.farming();
    }
}
