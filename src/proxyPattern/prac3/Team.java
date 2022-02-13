package proxyPattern.prac3;

//팀 하나에는 여러 맴버가..
public class Team {

    Jpa member = new ProxyMember();

    public void getTeamInfo() {
        System.out.println("팀 데이터를 가져온다.");
    }

    public void getMember(){
        System.out.println("이번에는 진짜 member객체가 필요하다.");
        member.getMember();
    }
}
