package strategyPattern.practice;

public class Walk implements Moveable{

    @Override
    public void move() {
        System.out.println("달려간다!");
    }
}
