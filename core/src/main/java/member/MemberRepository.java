package member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
