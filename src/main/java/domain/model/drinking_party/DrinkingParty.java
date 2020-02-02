package domain.model.drinking_party;

import domain.model.amount.*;
import domain.model.member.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 飲み会
 */
public class DrinkingParty {
    private final DrinkingPartyName drinkingPartyName;
    private final DrinkingPartyDateTime drinkingPartyDateTime;
    private final MemberList memberList;
    private final BillingAmount billingAmount;

    public DrinkingParty(
            DrinkingPartyName drinkingPartyName,
            DrinkingPartyDateTime drinkingPartyDateTime,
            MemberList memberList,
            BillingAmount billingAmount) {
        this.drinkingPartyName = drinkingPartyName;
        this.drinkingPartyDateTime = drinkingPartyDateTime;
        this.memberList = memberList;
        this.billingAmount = billingAmount;
    }

//    public void 割り勘() {
//        //一人当たりの支払金額Bが返ってくる
//        一人当たりの支払金額B.算出(
//                一つ分の支払金額.算出する(
//                        billingAmount, 合計割合.算出する(memberList)
//                ),
//                PaymentType.NORMAL
//        );
//    }

    public 参加者ごとの支払金額 割り勘() {
        // 合計割合を計算
        合計割合 _合計割合 = 合計割合.算出する(memberList);

        // 一つ分の支払金額を計算
        一つ分の支払金額 _一つ分の支払金額 = 一つ分の支払金額.算出する(billingAmount, _合計割合);

        // 一人当たりの支払金額B
        //一人当たりの支払金額B _一人当たりの支払金額B = 一人当たりの支払金額B.算出(_一つ分の支払金額, member1.getPaymentType());

        //TODO：参加者ごとの支払金額一覧として返却したい
        System.out.println(
                memberList.stream()
                        .map(member -> new 参加者ごとの支払金額(member, 一人当たりの支払金額B.算出(_一つ分の支払金額, member.getPaymentType())))
                        .collect(Collectors.toList())
                        .get(0)
                        .toString()
        );

        //TODO:↓ここまだ未定
        return new 参加者ごとの支払金額(
                new Member(new MemberName("aaa"), SecretaryType.幹事以外, PaymentType.NORMAL),
                一人当たりの支払金額B.算出(一つ分の支払金額.算出する(billingAmount, 合計割合.算出する(memberList)), PaymentType.NORMAL)
        );
    }
}
