package adapter.v1;

public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("물오리가 꽥!");
    }

    @Override
    public void fly() {
        System.out.println("물오리가 날아간다.");

    }
}
