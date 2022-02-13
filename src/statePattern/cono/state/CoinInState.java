package statePattern.cono.state;
//    내부 클래스의 장점
//        내부 클래스를 사용하면 다음과 같은 장점을 가질 수 있습니다.

//        1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있게 됩니다.
//
//        2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킵니다.
//
//        3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있습니다.

//내부 클래스는 필드와 마찬가지로 선언된 위치에 따라 다음과 같이 구분됩니다.
//
//        1. 정적 클래스(static class)
//        2. 인스턴스 클래스(instance class)
//        3. 지역 클래스(local class)
//        4. 익명 클래스(anonymous class)
//
//        외부 클래스 영역에 선언된 클래스 중에서 static 키워드를 가지는 클래스를 정적 클래스(static class)라고 합니다.
//        이러한 정적 클래스는 주로 외부 클래스(outer class)의 클래스 메소드에 사용될 목적으로 선언됩니다.

//        외부 클래스 영역에 선언된 클래스 중에서 static 키워드를 가지지 않는 클래스를 인스턴스 클래스(instance class)라고 합니다.
//        이러한 인스턴스 클래스는 주로 외부 클래스(outer class)의 인스턴스 변수나 인스턴스 메소드에 사용될 목적으로 선언됩니다.
//        지역 클래스(local class)란 외부 클래스의 메소드나 초기화 블록에 선언된 클래스를 의미합니다.
//        이러한 지역 클래스는 선언된 블록 내에서만 사용할 수 있습니다.

// 전략 패턴 VS 상태 패턴

/* 전략 패턴
같은 문제를 해결하는 여러 알고리즘(방식)이
클래스 별로 캡슐화 되어 있고  이들이 필요할 때 교체할 수 있도록 함으로써
동일한 문제를 다른 알고리즘으로 해결할 수 있는 패턴이다.*/

/*상태 패턴
상태에 따라 교환,변경을 쉽게 이뤄주는 디자인패턴.
상태에 대한 알고리즘을 인터페이스를 통해 독자적으로 관리해주며
이들이 필요할 때 교체할 수 있도록 함으로써 모든 상태를 조절해주는 패턴이다.*/

public class CoinInState implements State {

    private CoinInState() {};

    private static class LazyHolder {
        public static final CoinInState coinIn = new CoinInState();
    }

    public static CoinInState getInstance(){
        return CoinInState.LazyHolder.coinIn;
    }

    @Override
    public void sing() {
        System.out.println("노래를 부른다.");
    }

    @Override
    public void reserve() {
        System.out.println("예약을한다.");
    }

    @Override
    public void echoUp() {
        System.out.println("에코를 높힌다.");
    }

    @Override
    public void echoDown() {
        System.out.println("에코를 낮춘다.");
    }

    @Override
    public void insertCoin() {
        System.out.println("코인을 넣는다.");
    }
}
