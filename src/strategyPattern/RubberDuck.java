package strategyPattern;

public class RubberDuck extends Duck{


    public RubberDuck() {
         quackBehavior = new MuteQuack();
         flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("나는 고무 오리다.");
    }
}
