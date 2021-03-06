package hello.core.member;

import hello.core.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository; // only depending on the MemberRepository Interface
                                                    // Now this class focuses on execution not dependency
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) { // 이제 추상화에만 의존 한다 Dependency Injection
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    //Test
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

}
