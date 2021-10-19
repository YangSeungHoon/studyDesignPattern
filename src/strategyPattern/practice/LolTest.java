package strategyPattern.practice;

import java.io.IOException;

public class LolTest {
    public static void main(String[] args) throws IOException {

        Champion xinZhao = new XinZhao();
        xinZhao.introduce();
        System.out.print("신짜오가 ");
        xinZhao.performAttack();
        System.out.print("신짜오가 ");
        xinZhao.performDefend();
        System.out.print("신짜오가 ");
        xinZhao.performMove();

        Champion teemo = new Teemo();
        teemo.introduce();
        System.out.print("티모가 ");
        teemo.performAttack();
        System.out.print("티모가 ");
        teemo.performDefend();
        System.out.print("티모가 ");
        teemo.performMove();

        System.out.println("티모가 창을 얻었다. 이제 창으로 막는다.");
        teemo.setDefendable(new Shield());
        System.out.print("티모가 ");
        teemo.performDefend();


        System.out.println("신짜오 s, 티모 t");
        int ch = System.in.read();
        Champion champion = null;

        if(ch == 's' || ch == 'S') {
            champion = new XinZhao();
        }else{
            champion = new Teemo();
        }

        champion.performAttack();
        champion.performDefend();
        champion.performMove();
    }
}
