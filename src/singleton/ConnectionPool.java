package singleton;

public class ConnectionPool {

    private ConnectionPool() {
    }

    public static ConnectionPool getInstance() {

        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final ConnectionPool INSTANCE = new ConnectionPool();
    }


}



//public class ConnectionPool {
//
//    private static ConnectionPool instance = new ConnectionPool();
//
//
//    private ConnectionPool() {}
//
//    public static ConnectionPool getInstance() {
//
//        if(instance == null) {
//            instance = new ConnectionPool();
//        }
//        return instance;
//    }
//}

//
//멀티쓰레드 처리하기.
// sync 키워드를 넣으면 한 스레드가 메소드 사용을 끝내기 전까지 다른 스레드는 기다리게 된다. 다시 말해서 동시에 실행 될 수 없다는 것.
//public class ConnectionPool {
//
//    private static ConnectionPool instance = new ConnectionPool();
//
//
//    private ConnectionPool() {}
//
//    public static synchronized ConnectionPool getInstance() {
//
//        if(instance == null) {
//            instance = new ConnectionPool();
//        }
//        return instance;
//    }
//}

// 이렇게 하면 해결이 되긴한다. 그러나 이것은 속도에 영향을 줄 것이다.이렇게 두면 getInstance를 할때마다 동기화를 진행하게 되기 때문이다.
// 근데 핵심은 그냥 동기화가 필요한건 만드는 타이밍 한 번이다. 이것을 해결하는 방법을 소개한다.
//
//public class ConnectionPool {
//
//    private static ConnectionPool instance = new ConnectionPool();
//
//
//    private ConnectionPool() {}
//
//    public static  ConnectionPool getInstance() {
//        return instance;
//    }
//}

//DCL(Double - Checking Locking)을 사용하면 일단 인스턴스가 생성되어 있는지 확인하고 생성 되어 있지 않을때만 동기화를 할 수 있다.
//이러한 방식은 처음에만 동기화 하고 그 이후에는 동기화를 하지 않는다.
//
//public class ConnectionPool {
//
//    private volatile static ConnectionPool instance;
//
//
//    private ConnectionPool() {}
//
//    public static ConnectionPool getInstance() {
//        if (instance == null) {
//            synchronized (ConnectionPool.class) {
//                if (instance == null) {
//                    instance = new ConnectionPool();
//                }
//            }
//        }
//        return instance;
//    }
//}



// LazyHolder 방법.

//가장 완벽하다고 평가받는 방법이다. JAVA 버젼역시 무관하고 성능도 뛰어나다.
// 이 방법은 static영역에 초기화를 하지만 객체가 필요한시점까지 초기화를 미루는 방식이다.
// LazyHolder 클래스의 변수가 없기 때문에 Singleton 클래스 로딩 시 LazyHolder 클래스를 초기화하지 않는다.
// Singleton 클래스의 getInstance() 메서드에서 LazyHolder.INSTANCE를 참조하는 순간 Class가 로딩되며 초기화가 진행된다.
// Class를 로딩하고 초기화하는 시점은 thread-safe를 보장하기 때문에 volatile이나 synchronized 같은 키워드가 없어도 thread-safe 하면서
// 성능도 보장함.
//
//public class ConnectionPool {
//
//    private ConnectionPool() {
//    }
//
//    public static ConnectionPool getInstance() {
//
//        return LazyHolder.INSTANCE;
//    }
//
//    private static class LazyHolder {
//        private static final ConnectionPool INSTANCE = new ConnectionPool();
//    }
//
//
//}
