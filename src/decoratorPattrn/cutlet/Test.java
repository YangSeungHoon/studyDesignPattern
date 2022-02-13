package decoratorPattrn.cutlet;

public class Test {

    public static void main(String[] args) {


        Cutlet porkCutlet = new PorkCutlets();
        System.out.println(porkCutlet.getDescription()+ porkCutlet.cost());



        Cutlet cheesePorkCutlet = new Cheese(porkCutlet);
        System.out.println(cheesePorkCutlet.getDescription()+ cheesePorkCutlet.cost());

        System.out.println();

        Cutlet fishCutlet = new FishCutlets();
        System.out.println(fishCutlet.getDescription()+ fishCutlet.cost());

        System.out.println();

        Cutlet tartarSauce = new TartarSauce(fishCutlet);
        System.out.println(tartarSauce.getDescription()+ tartarSauce.cost());

        System.out.println();

        Cutlet tastelessFood = new TartarSauce(new Cheese(new FishCutlets()));
        System.out.println(tastelessFood.getDescription()+ tastelessFood.cost());
    }
}



