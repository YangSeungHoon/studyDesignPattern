package templateMethodPattern.prac2;

public class CustomerA extends Subway{

    @Override
    public void putCheese() {
        System.out.println("모짜렐라 치즈를 넣는다.");
    }


    //훅 메서드
    @Override
    public void putSauce() {
        System.out.println("소스는 어떤 소스를 드릴까요?");
        System.out.println("1.hotbbq 2. hot렌치 3. hot어니언 4.hot후추 5.default");
        String sauce = Test.scanner.next();
        StringBuilder sb = new StringBuilder();
        sb.append(sauce);
        sb.append("소스를 추가하겠습니다.");
        System.out.println(sb.toString());
    }


    @Override
    public void isCucumberEatable() {
        System.out.println("고객님 오이를 넣을까요??");
        String answer = Test.scanner.next();
        if (answer.equals("y")) {
            System.out.println("오이를 넣겠다.");
        }
        System.out.println("오이를 안넣겠다.");
    }
}
