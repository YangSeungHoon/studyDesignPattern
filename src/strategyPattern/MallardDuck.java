package strategyPattern;

public class MallardDuck extends Duck{


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는 물오리다.");
    }
}
