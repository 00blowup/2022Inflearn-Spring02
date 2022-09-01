package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    @Test
    void join(){
        //given
        MemberService memberService = new MemberServiceImpl();
        Member in = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(in);
        Member out = memberService.findMember(1L);

        //then
        Assertions.assertThat(out).isEqualTo(in);
    }
}
