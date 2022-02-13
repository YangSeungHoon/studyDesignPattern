package strategyPattern.practice;

import strategyPattern.practice.Attackable;

public class SpearStrategy implements Attackable {

    @Override
    public void attack() {
        System.out.println("창으로 찌른다.");
    }
}
