package adapter.v2;


public class PrintBanner implements  Print {

    private Banner banner;

    public PrintBanner(String string){
        banner = new Banner(string);
    }

    @Override
    public void printWeek() {

        banner.showWithParen();
    }

    @Override
    public void printStrong() {

        banner.shoWithAster();
    }
}

//상속 보다 구성 is a 아래있는 녀석이 상위녀석 이 될 수 있다. 결합도가 높아진다. 왜냐하면 아래에다가 상속해버리면
// 아래에서 나는 이거 안쓰고 싶어도 다써야한다.  하나밖에 상속이ㅏㄴ되니까
// 구성 has a 위에서 하느일을 아래에서도 할 수 있다. 근데 다른 일도 추가적으로할 수도 있다. able able 다중구현 SOLID I에해당

//아래의 코드는 상속을 이용한 코드임.
// 그러나 상속의 경우에는 결합도가 높아진다는 단점이 있기 때문에 상속 보다는 구성을 사용하는게 더 좋다고 보여짐.
//public class PrintBanner extends Banner implements Print{
//
//    public PrintBanner(String string) {
//        super(string);
//    }
//
//    @Override
//    public void printWeek() {
//
//    }
//
//    @Override
//    public void printStrong() {
//
//    }
//}
