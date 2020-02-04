package domain.model.amount;

import domain.model.member.MemberList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 参加者ごとの支払金額一覧 {
    private final List<参加者ごとの支払金額> values;

    public 参加者ごとの支払金額一覧(List<参加者ごとの支払金額> values) {
        this.values = values;
    }

    public Stream<参加者ごとの支払金額> stream() {
        return values.stream();
    }

    public 合計支払金額 計算する() {
        return new 合計支払金額(
                values.stream()
                        .mapToInt(amount -> amount.get_一人当たりの支払金額B().getValue())
                        .sum()
        );
    }

    public static 参加者ごとの支払金額一覧 create(MemberList memberList, BillingAmount billingAmount) {
        return new 参加者ごとの支払金額一覧(
                memberList.stream()
                        .map(member -> 参加者ごとの支払金額.create(member, 一つ分の支払金額.算出する(billingAmount, memberList.合計割合を算出する())))
                        .collect(Collectors.toList())
        );
    }
}
