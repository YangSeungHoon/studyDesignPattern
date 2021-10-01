package decoratorPattrn;

public class PorkCutlets extends Cutlet {


    public PorkCutlets() {
        description = "돈가스";
    }

    @Override
    public double cost() {
        return 10000;
    }
}

//
//public class PorkCutlets extends Cutlet {
//
//    @Override
//    public void cooking() {
//
//        System.out.print("PorkCutlets");
//    }
//}