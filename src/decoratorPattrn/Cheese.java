package decoratorPattrn;

public class Cheese extends Decorator{

    Cutlet cutlet;

    public Cheese(Cutlet cutlet) {
        this.cutlet = cutlet;
    }


    @Override
    public String getDescription() {
        return cutlet.getDescription() +" add cheese";
    }


    @Override
    public double cost() {
        return 2000 +cutlet.cost() ;
    }

}

//public class Cheese extends Decorator{
//
//    public Cheese(Cutlet cutlet) {
//        super(cutlet);
//    }
//
//    public void cooking(){
//        super.cooking();
//        System.out.print(" add Cheese");
//    }
//}