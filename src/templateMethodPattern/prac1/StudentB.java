package templateMethodPattern.prac1;

public class StudentB extends Schedule{
    @Override
    void training() {
        System.out.println("웨이트 트레이닝");
    }

    @Override
    void study() {
        System.out.println("인강을 통한 학습");
    }

    @Override
    void playGame() {
        System.out.println("롤 게임 하기.");
    }

    @Override
    boolean checkCondition() {
        System.out.println("학생B는 매일 상태가 좋다.");
        return true;
    }
}
