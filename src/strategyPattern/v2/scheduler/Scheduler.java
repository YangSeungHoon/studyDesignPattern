package strategyPattern.v2.scheduler;

public interface Scheduler {

    void getNextCall();
    void sendCallToAgent();
}
