package templateMethodPattern.prac1;

public class StudentA extends Schedule{
    @Override
    void training() {
        System.out.println("맨몸 운동");
    }

    @Override
    void study() {
        System.out.println("책을 이용한 공부");
    }

    @Override
    void playGame() {
        System.out.println("배그 게임 하기.");
    }

    @Override
    boolean checkCondition() {
        System.out.print("학생 A는 오늘 상태가 괜찮은가??");
        String answer = Test.scanner.next();
        if(answer.equals("y")){
            return true;
        }
        return false;
    }
}
