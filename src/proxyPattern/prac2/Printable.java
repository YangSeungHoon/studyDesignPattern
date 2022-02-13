package proxyPattern.prac2;

public interface Printable {
    public  void setPrinterName(String name);// 이름 설정
    public  String getPrinterName(); //이름 호출
    public  void print(String string); //문자열 표시(프린트 출력)

}
