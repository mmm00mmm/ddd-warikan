package domain.model.member;

import domain.model.rate.合計割合;

import java.util.List;
import java.util.stream.Stream;

public class MemberList {
    private final List<Member> members;

    public MemberList(List<Member> memberList) {
        this.members = memberList;
    }

    public Stream<Member> stream() {
        return members.stream();
    }

    public int size() {
        return members.size();
    }

    public 合計割合 合計割合を算出する() {
        return new 合計割合(
                members.stream()
                        .map(Member::getPaymentType)
                        .mapToInt(PaymentType::getValue)
                        .sum()
        );
    }
}
