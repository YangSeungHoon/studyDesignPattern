package strategyPattern.practice;

public class Teemo extends Champion{

    public Teemo() {
        attackable = new PoisonStrategy();
        defendable = new noShieldStrategy();
        moveable = new Walk();
    }

//    @Override
//    public void introduce() {
//        System.out.println("티모 대위!");
//    }
}
