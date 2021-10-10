package adapter.v1;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("칠면조는 골골!");
    }

    @Override
    public void fly() {

        System.out.println("칠면조가 날아간다.");
    }
}
