package strategyPattern.practice;

public class PoisonStrategy implements Attackable{
    @Override
    public void attack() {
        System.out.println("독침을 쏜다.");
    }
}
