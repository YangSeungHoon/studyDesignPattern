package proxyPattern.prac2;


// Print하는 핵심 메서드는 진짜 객체가 수행해줘야 하고
// 그 외의 다른 부가적인 기능들은 가짜 객체인 (Proxy)가 대신한다.

public class Test {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("현재의 이름은" + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("현재의 이름은" + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");

        p.print("test");
        p.setPrinterName("Tomas");
        System.out.println("현재의 이름은" + p.getPrinterName() + "입니다.");

    }

}
