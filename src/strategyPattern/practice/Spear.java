package strategyPattern.practice;

import strategyPattern.practice.Attackable;

public class Spear implements Attackable {

    @Override
    public void attack() {
        System.out.println("창으로 찌른다.");
    }
}
