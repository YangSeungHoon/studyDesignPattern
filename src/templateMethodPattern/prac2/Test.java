package templateMethodPattern.prac2;

import java.util.Scanner;

public class Test {

    // 템플릿 메서드
    // 서브웨이
    // KBBQ
    // 1.빵 선택
    // 2. 치즈 넣기
    // 3. 디폴트 고기 넣기. (디폴트)
    // 4. 야채 넣을건데 오이 넣을까 말까 ( abstract )
    // 5. 소스 넣기  (훅 메서드 어거지로 사용)
    // 6. 결제 (디폴트)

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        CustomerA a = new CustomerA();
        CustomerB b = new CustomerB();

        a.selectMenu();

        b.selectMenu();
    }
}
