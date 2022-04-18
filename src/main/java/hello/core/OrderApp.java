package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.order.Order;
import hello.core.member.order.OrderService;
import hello.core.member.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();


        Long memberID = 1L;
        Member member = new Member(memberID, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberID, "itemA", 10000);

        System.out.println("order = " + order);
        
    }
}
