package proxyPattern.prac3;

public class Test {

    public static void main(String[] args) {
        Jpa member = new ProxyMember();
        member.getOtherData();
        member.getMember();

        System.out.println("====================");
        Team team = new Team();
        team.getTeamInfo();
        team.getMember();
    }
}
