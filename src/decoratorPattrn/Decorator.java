package decoratorPattrn;

public abstract class Decorator extends Cutlet{

    Cutlet cutlet;

    public Decorator(Cutlet cutlet){
        this.cutlet = cutlet;
    }

    @Override
    public void cooking() {

        cutlet.cooking();
    }
}
