package adapter.v4;

import adapter.v4.Turkey;

public class BlackTurkey implements Turkey {
    @Override
    public void crycry() {
        System.out.println("검은 칠면조가 울어요");
    }

    @Override
    public void fly() {

        System.out.println("검은 칠면조가 날아요");
    }
}
