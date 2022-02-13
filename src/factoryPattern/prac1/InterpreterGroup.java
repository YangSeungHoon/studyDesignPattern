package factoryPattern.prac1;

import static factoryPattern.prac1.InterpreterType.RUSSIA;

public class InterpreterGroup extends InterpreterFactory{


    @Override
    Interpreter hire(InterpreterType interpreterType) {

        switch (interpreterType){
            case RUSSIA:
                return new RussiaInterpreter();
            default:
                return new EnglishInterpreter();
        }
    }
}
