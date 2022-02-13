package strategyPattern.practice2;

public class Test {

    public static void main(String[] args) {

        //로봇 자료형 가지고 Atom 객체 만들기.
        //atom.performAttack() 해서 attack실현.
        Robot atom = new Atom();
        atom.performAttack();

        atom.setAttackable(new Laiser());
        atom.performAttack();
    }
}
