package templateMethodPattern.prac2;

public class CustomerB extends Subway {

    @Override
    public void putCheese() {
        System.out.println("앙팡 치즈를 넣는다.");
    }


    @Override
    public void putSauce() {
        System.out.println("소스는 어떤 소스를 드릴까요?");
        System.out.println("1. bbq 2. 렌치 3.어니언 4.후추 5.default");
        String sauce = Test.scanner.next();
        System.out.println(sauce+"소스를 추가하겠습니다.");
    }
}
