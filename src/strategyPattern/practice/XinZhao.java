package strategyPattern.practice;

public class XinZhao extends Champion{


    public XinZhao() {
        attackable = new Spear();
        defendable = new Shield();
        moveable = new Walk();
    }

    @Override
    public void introduce() {
        System.out.println("전장으로!");
    }


}
