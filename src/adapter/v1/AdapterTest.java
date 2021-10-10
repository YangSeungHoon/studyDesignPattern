package adapter.v1;

public class AdapterTest {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        System.out.println("칠면조가 말한다..");
        turkey.gobble();
        turkey.fly();

        System.out.println("오리가 말한다..");
        testDuck(duck);

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("칠면조 어댑타가 말한다.");
        testDuck(turkeyAdapter);


    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
