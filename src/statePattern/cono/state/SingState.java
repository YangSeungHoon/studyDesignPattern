package statePattern.cono.state;

public class SingState implements State {

    private SingState(){};

    private static class LazyHolder {
        public static final SingState sing = new SingState();
    }

    public static SingState getInstance(){
        return SingState.LazyHolder.sing;
    }
    @Override
    public void sing() {
        System.out.println("노래를 부른다.");
    }

    @Override
    public void reserve() {
        System.out.println("노래를 부르는 중에 예약을 한다.");
    }
    @Override
    public void echoUp() {
        System.out.println("노래를 부르는 중에 에코를 높힌다.");
    }

    @Override
    public void echoDown() {
        System.out.println("노래를 부르는 중에 에코를 낮춘다.");
    }

    @Override
    public void insertCoin() {
        System.out.println("노래를 부르는 중에 코인을 넣는다.");
    }
}
