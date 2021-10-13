package strategyPattern.v1;

public class TestDuck{

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();

        rubberDuck.performFly();

        rubberDuck.setFlyBehavior(new FlyRocketPowered());
        rubberDuck.performFly();

        rubberDuck.performQuack();

    }
}
