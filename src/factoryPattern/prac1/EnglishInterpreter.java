package factoryPattern.prac1;

public class EnglishInterpreter extends Interpreter{
    @Override
    public String introduce() {
        return "영어통역사";
    }

    @Override
    public void negotiatePay() {
        System.out.println("무료로 해주겠습니다");
    }
}
