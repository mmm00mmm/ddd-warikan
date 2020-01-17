package domain.model.member;

import java.util.List;

public class MemberList {
    private final List<Member> values;

    public MemberList(List<Member> memberList) {
        this.values = memberList;
    }
}
