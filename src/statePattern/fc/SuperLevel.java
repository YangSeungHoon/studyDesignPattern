package statePattern.fc;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("엄청 빨리 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 점프한다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 한다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고수 레벨 입니다.****");
    }


}
