package statePattern.cono;

import statePattern.cono.state.CoinInState;
import statePattern.cono.state.SingState;

public class StatePatternTest {

    public static void main(String[] args) {


        // 초기 시작은 코인 = 0, 예약 = 0, NoCoin State 이다.
        Machine machine = new Machine();

        // NoCoin State 에서는 노래 부르기, 예약하기, 볼륨 오르 내리기 전부다 불가능하다.
        // 그래서 코인을 넣는다..
        machine.sing();
        machine.reserve();
        machine.echoDown();
        machine.echoUp();
        machine.insertCoin(1);

        System.out.println("====================");
        machine.setState(CoinInState.getInstance());
        //위에서 코인을 넣었다. 그러나 예약곡이 없어서 노래를 부를 수 없다.
        // 노래는 부를 수 없으나 그 외 기능은 가능하다.
        // 현재 상태는 CoinInState이다.
        machine.sing();
        machine.echoDown();
        machine.echoUp();
        machine.insertCoin(1);
        machine.reserve();
        // 코인이 들어간 상태에서 위의 reserve()로 예약을 했으니.. 이제 노래 가능.
        machine.sing();

        System.out.println("====================");
        //마지막 상태는 SingState이다. 노래를 부르는 상태이다.
        // 노래를 부르는 상태에서는 예약, 에코 높게 낮게, 코인 넣기 다 가능하다.
        machine.setState(SingState.getInstance());
        machine.sing();
        machine.echoDown();
        machine.echoUp();
        machine.insertCoin(1);
        machine.reserve();

        machine.sing();


        System.out.println("=============");
        // 마지막으로는 노래방 기계 객체를 통해서 coin의 갯수, 예약곡 객수 및 추가적인 기능들을
        // 더 구현해볼 수 있겠다..
        System.out.println("코인의 갯수는" +machine.getCoin()+"개 이다.");
        System.out.println("현재 예약곡의 갯수는 "+ machine.getReservation()+"개 이다.");

    }
}
