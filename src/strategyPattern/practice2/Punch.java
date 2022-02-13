package strategyPattern.practice2;

public class Punch implements Attackable{
    @Override
    public void attack() {
        System.out.println("펀치!");
    }
}
