
package statePattern.cono;

import statePattern.cono.state.*;

public class Machine {

    private State state;
    private int coin;
    private int reservation;

    public Machine() {
        state = NoCoinState.getInstance();
        coin = 0;
        reservation = 0;
    }



    public int getCoin() {
        return coin;
    }

    public int getReservation() {
        return reservation;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void sing() {

        if(state.getClass() == NoCoinState.class) {
          state.sing();
        } else if(this.reservation > 0) {
            state.sing();
            reservation--;
            coin--;
        }else{
            System.out.println("예약곡이 없습니다.");
        }
    }


    public void reserve() {
        if(state.getClass() != NoCoinState.class) {
            state.reserve();
            this.reservation++;
        } else{
            state.reserve();
        }
    }


    public void echoUp() {
        state.echoUp();
    }


    public void echoDown() {
        state.echoDown();
    }

    public void insertCoin(int coin) {
        state.insertCoin();
        this.coin += coin;
    }

}

