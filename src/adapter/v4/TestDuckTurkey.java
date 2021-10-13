package adapter.v4;

public class TestDuckTurkey {

    public static void main(String[] args) {

        Duck yellowDuck = new YellowDuck();
        yellowDuck.cry();

        Turkey turkey = new BlackTurkey();
        turkey.crycry();

        Duck duckAdapter = new TurkeyAdapter(turkey);

        duckAdapter.cry();
        duckAdapter.fly();

    }

}
