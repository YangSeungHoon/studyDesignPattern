package strategyPattern.practice2;

public class Fly implements Moveable{
    @Override
    public void move() {
        System.out.println("날 수 있다.");
    }
}
