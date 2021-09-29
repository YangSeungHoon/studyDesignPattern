package decoratorPattrn;

public class TartarSauce extends Decorator{

    public TartarSauce(Cutlet cutlet) {
        super(cutlet);
    }

    public void cooking() {
        super.cooking();
        System.out.print(" add tartarSauce");
    }
}
