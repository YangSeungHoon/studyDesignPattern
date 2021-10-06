package strategyPattern;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓을 달고 날아간다.");
    }
}
