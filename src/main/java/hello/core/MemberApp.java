package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        //멤버서비스 객체
        MemberService memberService = new MemberServiceImpl();
        
        //넣을 멤버
        Member in = new Member(1L, "memberA", Grade.VIP);
        //넣기
        memberService.join(in);
        //찾기
        Member out = memberService.findMember(1L);

        //넣은 놈과 찾은 놈의 이름을 콘솔에 출력
        System.out.println("joined: " + in.getName());
        System.out.println("found: " + out.getName());
    }
}
