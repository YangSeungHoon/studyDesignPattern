package decoratorPattrn.cutlet;

public class TartarSauce extends Decorator{

        Cutlet cutlet;


    public TartarSauce(Cutlet cutlet) {
        this.cutlet = cutlet;
    }

    @Override
    public String getDescription() {
        return cutlet.getDescription() + " add tartarSauce";
    }

    @Override
    public double cost() {
        return 3000 + this.cutlet.cost() ;
    }

}

//
//public class TartarSauce extends Decorator{
//
//    public TartarSauce(Cutlet cutlet) {
//        super(cutlet);
//    }
//
//    public void cooking() {
//        super.cooking();
//        System.out.print(" add tartarSauce");
//    }
//}