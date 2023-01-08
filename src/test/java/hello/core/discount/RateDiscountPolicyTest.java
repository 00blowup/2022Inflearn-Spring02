package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//편리한 사용을 위한 static import
import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP gets 10% discount")
    void vip_o() {
        //given: VIP 고객이 주어졌을 때
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when: 구매금액 10000원에 대한 할인금액 계산을 수행하면
        int discount = discountPolicy.discount(member, 10000);
        //then: 결과로 1000원이 도출됨을 확인한다
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("BASIC gets no discount")
    void vip_x() {
        //given: 일반 고객이 주어졌을 때
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
        //when: 구매금액 10000원에 대한 할인금액 계산을 수행하면
        int discount = discountPolicy.discount(member, 10000);
        //then: 결과로 0원이 도출됨을 확인한다
        assertThat(discount).isEqualTo(0);
    }

}