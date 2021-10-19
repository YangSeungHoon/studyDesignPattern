package strategyPattern.practice;

public class Shield implements Defendable {
    @Override
    public void defend() {
        System.out.println("창으로 막는다.");
    }
}
