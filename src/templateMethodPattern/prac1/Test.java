package templateMethodPattern.prac1;

import java.util.Scanner;

public class Test {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        StudentA a = new StudentA();
        StudentB b = new StudentB();

        System.out.println("A의 일과.");
        a.doDailyRoutine();

        System.out.println("B의 일과");
        b.doDailyRoutine();
    }
}
