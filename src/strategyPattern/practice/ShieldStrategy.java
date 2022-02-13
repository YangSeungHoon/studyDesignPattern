package strategyPattern.practice;

public class ShieldStrategy implements Defendable {
    @Override
    public void defend() {
        System.out.println("창으로 막는다.");
    }
}
