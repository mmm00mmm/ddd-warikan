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

    @Override
    public String toString() {
        return "飲み会名:" + drinkingPartyName.toString() + "\n"
                + "開催日時" + drinkingPartyDateTime.toString() + "\n"
                + "参加人数:" + memberList.size() + "\n"
                + "請求金額:" + billingAmount.toString() + "\n\n";
    }

    public 参加者ごとの支払金額一覧 割り勘() {
        一つ分の支払金額 _一つ分の支払金額 = 一つ分の支払金額.算出する(billingAmount, 合計割合.算出する(memberList));

        return new 参加者ごとの支払金額一覧(
                memberList.stream()
                        .map(member -> new 参加者ごとの支払金額(member, 一人当たりの支払金額B.算出(_一つ分の支払金額, member.getPaymentType())))
                        .collect(Collectors.toList())
        );
    }
}
