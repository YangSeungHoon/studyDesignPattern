package decoratorPattrn;

public class Cheese extends Decorator{

    public Cheese(Cutlet cutlet) {
        super(cutlet);
    }

    public void cooking(){
        super.cooking();
        System.out.print(" add Cheese");
    }
}
