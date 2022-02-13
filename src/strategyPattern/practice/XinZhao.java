package strategyPattern.practice;

public class XinZhao extends Champion{


    public XinZhao() {
        attackable = new SpearStrategy();
        defendable = new ShieldStrategy();
        moveable = new Walk();
    }
//
//    public void introduce() {
//        System.out.println("전장으로!");
//    }


}
