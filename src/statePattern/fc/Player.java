package statePattern.fc;

//Context에 해당
public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        run();
        for(int i = 0; i <count; i++) {
            jump();
        }
        turn();
    }


    public void run() {
        level.run();
    }
    public void jump(){
        level.jump();
    }
    public void turn(){
        level.turn();
    }



}
