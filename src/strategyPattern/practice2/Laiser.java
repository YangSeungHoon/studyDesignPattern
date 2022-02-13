package strategyPattern.practice2;

public class Laiser implements Attackable{
    @Override
    public void attack() {
        System.out.println("레이저 빔!");
    }
}
