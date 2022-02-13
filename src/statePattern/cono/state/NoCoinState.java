
package statePattern.cono.state;


import statePattern.cono.Machine;

public class NoCoinState implements State{

    Machine machine;


    private static class LazyHolder {
        public static final NoCoinState noCoin = new NoCoinState();
    }

    public static NoCoinState getInstance(){
        return NoCoinState.LazyHolder.noCoin;
    }


    @Override
    public void sing() {
        System.out.println("코인이 없어서 노래를 시작할 수 없습니다.");
    }

    @Override
    public void reserve() {
        System.out.println("코인이 없어서 예약할 수 없습니다.");
    }

    @Override
    public void echoUp() {
        System.out.println("코인이 없어서 에코를 높힐 수 없습니다.");
    }

    @Override
    public void echoDown() {
        System.out.println("코인이 없어서 에코를 낮출 수 없습니다.");
    }

    @Override
    public void insertCoin() {
        System.out.println("코인을 넣었다.");
    }
}

