package decoratorPattrn.weapon;

public class AngledGrip implements Grip {

    Weapon baseWeapon;

    public AngledGrip(Weapon baseWeapon) {
        this.baseWeapon = baseWeapon;
    }

    @Override
    public void farming() {
        baseWeapon.farming();
        getAngledGrip();
    }

    public void getAngledGrip(){
        System.out.println("수평 소잡이를 획득했습니다.");
    }
}
