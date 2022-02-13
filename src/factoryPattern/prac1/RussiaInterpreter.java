package factoryPattern.prac1;

public class RussiaInterpreter extends Interpreter{
    @Override
    public String introduce() {
        return "러시아어 통역사";
    }

    @Override
    public void negotiatePay() {
        System.out.println("돈은 만원만 주세요");
    }
}
