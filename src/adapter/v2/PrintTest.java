package adapter.v2;

public class PrintTest {

    public static void main(String[] args) {

        Print print = new PrintBanner("hello");
        print.printStrong();
        print.printWeek();
    }
}
