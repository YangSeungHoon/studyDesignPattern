package strategyPattern.v1;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("나는 못난다.");
    }
}
