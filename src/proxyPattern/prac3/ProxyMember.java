package proxyPattern.prac3;

public class ProxyMember implements Jpa{


    Member member;

    @Override
    public void getOtherData() {
        System.out.println("Proxy가 프린트해준다.");
    }

    @Override
    public void getMember() {
        if(member == null){
            this.member = new Member();
        }
        member.getMember();
    }
}
