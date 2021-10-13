package adapter.v4;

public class YellowDuck implements Duck{
    @Override
    public void cry() {
        System.out.println("노랑 오리가 울어요");
    }

    @Override
    public void fly() {
        System.out.println("노랑 오리가 날아요");
    }
}
