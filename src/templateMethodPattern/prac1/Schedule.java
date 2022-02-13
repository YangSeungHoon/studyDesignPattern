package templateMethodPattern.prac1;

public abstract class Schedule {

    // 해당 알고리즘은 서브 클래스에서 변경이 불가능해야 하니까 final
    final public void doDailyRoutine() {

        wakeUp();
        training();
        study();
        takeShower();
        if(checkCondition()) {
            playGame();
;        }
    }

    //하위 클래스(서브 클래스) 에서 해당 메서드 오버라이드 불가능하게 final을 붙여준다.
    final public void wakeUp(){
        System.out.println("아침 기상.");
    }

//    final public void sleep() {
//        System.out.println("잔다.");
//    }

    final public void takeShower(){
        System.out.println("샤워를 한다.");
    }

//abstract void sleep();
    abstract void training();
    abstract void study();
    abstract void playGame();

    //훅 메서드
    boolean checkCondition() {
        return true;
    }
}
