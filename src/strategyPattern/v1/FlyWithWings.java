package strategyPattern.v1;

public class FlyWithWings implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.println("난다");
    }
}
