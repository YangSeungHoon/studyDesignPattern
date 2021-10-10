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
