package factoryPattern.prac1;

public class Test {

    public static void main(String[] args) {

        InterpreterFactory interpreterFactory = new InterpreterGroup();

        Interpreter ENInterpreter = interpreterFactory.hire(InterpreterType.ENGLISH);
        Interpreter RUInterpreter = interpreterFactory.hire(InterpreterType.RUSSIA);

        System.out.println(ENInterpreter.introduce());
        System.out.println(RUInterpreter.introduce());

        ENInterpreter.negotiatePay();
        RUInterpreter.negotiatePay();

    }
}
