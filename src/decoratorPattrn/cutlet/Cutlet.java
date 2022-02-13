package decoratorPattrn.cutlet;

public abstract class Cutlet {

    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

//
//public abstract class Cutlet {
//
//    public abstract void cooking();
//}