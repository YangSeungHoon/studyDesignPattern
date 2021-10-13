package adapter.v4;

public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void cry() {
            turkey.crycry();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
