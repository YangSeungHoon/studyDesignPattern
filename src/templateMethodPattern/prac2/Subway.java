package templateMethodPattern.prac2;

public abstract class Subway {


    // 1.빵 선택 (디폴트)
    // 2. 치즈 넣기   (abstract)
    // 3. 디폴트 고기 넣기. (디폴트)
    // 4. 야채 넣을건데 오이 넣을까 말까 ( abstract )
    // 5. 소스 넣기  (훅 메서드 어거지로 사용)
    // 6. 결제 (디폴트)

    public final void selectMenu() {
        selectBread();//O
        putCheese(); //O
        putMeat(); // O

        isCucumberEatable(); //
        putSauce(); //훅 메서드 //
        pay();// O
    }

    public final void selectBread() {
        System.out.println("빵을 도마위에 놓는다.");
    }

    public final void putMeat(){
        System.out.println("고기를 빵위에 놓는다.");
    }

    public final void pay(){
        System.out.println("결제를 합니다.");
    }


    public void putSauce() {
        String defaultSauce = "소스는 안뿌린다.";
        System.out.println(defaultSauce.toString());
    }

    public void isCucumberEatable(){
        System.out.println("오이를 넣겠다.");
    }

    public abstract void putCheese();
}
