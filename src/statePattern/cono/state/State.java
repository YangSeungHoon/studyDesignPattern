package statePattern.cono.state;

public interface State {

    // 상태
// NoCoinState 코인이 없는 상태
// CoinInState 코인을 넣은
// SingState 노래를 부르는 상태



    // 상태에 따른 동작들..
    void sing(); // 노래를 부른다.
    void reserve(); // 예약을 한다.
    void echoUp(); // 에코 높이기.
    void echoDown(); // 에코 내리기.
    void insertCoin(); // 동전 넣기.
}
