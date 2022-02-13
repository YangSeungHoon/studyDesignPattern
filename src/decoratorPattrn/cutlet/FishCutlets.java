package decoratorPattrn.cutlet;

public class FishCutlets extends Cutlet{

    public FishCutlets() {
        description =  "생선가스";
    }

    @Override
    public double cost() {
        return 5000;
    }
}

//
//public class FishCutlets extends Cutlet{
//    @Override
//    public void cooking() {
//        System.out.print("FishCutlets");
//    }
//}