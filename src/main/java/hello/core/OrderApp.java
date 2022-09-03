package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    private static MemberService memberService = new MemberServiceImpl();
    private static OrderService orderService = new OrderServiceImpl();

    public static void main(String[] args) {
        //회원 정보 생성, 회원 가입
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        //할인이 적용된 주문 정보 생성
        Order order = orderService.createOrder(memberId, "itemA", 10000);

        //출력문으로 결과 확인
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());
    }
}
