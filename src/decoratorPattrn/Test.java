package decoratorPattrn;

public class Test {

    public static void main(String[] args) {

        System.out.println("돈가스 만들기");
        Cutlet porkCutlet = new PorkCutlets();
        porkCutlet.cooking();

        System.out.println();
        System.out.println("치즈 돈가스 만들기");
        Cutlet cheesePorkCutlet = new Cheese(porkCutlet);
        cheesePorkCutlet.cooking();

        System.out.println();
        System.out.println("생선가스 만들기");
        Cutlet fishCutlet = new FishCutlets();
        fishCutlet.cooking();

        System.out.println();
        System.out.println("생선가스 위에 타르타르 소스만들기");
        Cutlet tartarSauce = new TartarSauce(fishCutlet);
        tartarSauce.cooking();

        System.out.println();
        System.out.println("생선 가스 위에 치즈 뿌리고 그 위에 다시 타르타르 소스 뿌리기");
        // 맛 없는 요리 만들어보기. 생선 가스 위에 치즈 뿌리고 그 위에 다시 타르타르 소스 뿌리기.
        Cutlet tastelessFood = new TartarSauce(new Cheese(new FishCutlets()));
        tastelessFood.cooking();
    }
}
