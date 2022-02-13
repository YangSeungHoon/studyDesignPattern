package proxyPattern.prac3;

public class Member implements Jpa{

    @Override
    public void getOtherData() {}

    @Override
    public void getMember() {
        System.out.println("진짜 객체 getMember");
    }
}
