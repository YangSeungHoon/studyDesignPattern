package strategyPattern.practice2;

public class NoFly implements Moveable{
    @Override
    public void move() {
        System.out.println("날 수 없다.");
    }
}
