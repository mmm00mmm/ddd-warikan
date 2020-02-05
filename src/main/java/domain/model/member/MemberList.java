package domain.model.member;

import domain.model.rate.合計割合;

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

    public int size() {
        return values.size();
    }

    public 合計割合 合計割合を算出する() {
        return new 合計割合(
                values.stream()
                        .map(Member::getPaymentType)
                        .mapToInt(PaymentType::getValue)
                        .sum()
        );
    }
}
