package domain.model.member;

import java.util.List;
import java.util.stream.Stream;

public class MemberList {
    private final List<Member> values;

    public MemberList(List<Member> memberList) {
        this.values = memberList;
    }

    public Stream<Member> stream() {
        return values.stream();
    }
}
