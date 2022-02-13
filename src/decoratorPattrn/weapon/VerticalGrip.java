package decoratorPattrn.weapon;

public class VerticalGrip implements Grip {

    Weapon baseWeapon;

    public VerticalGrip(Weapon baseWeapon) {
        this.baseWeapon = baseWeapon;
    }

    @Override
    public void farming() {
        baseWeapon.farming();
        getVerticalGrip();
    }

    public void getVerticalGrip(){
        System.out.println("수직 손잡이를 획득했습니다.");
    }
}
