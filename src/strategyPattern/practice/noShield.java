package strategyPattern.practice;

public class noShield implements Defendable{
    @Override
    public void defend() {
        System.out.println("막지 못하고 맞는다.");
    }
}
