package domain.model.drinking_party;

import domain.model.amount.BillingAmount;
import domain.model.amount.参加者ごとの支払金額一覧;
import domain.model.amount.均一の支払金額;
import domain.model.member.MemberList;

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
        return 参加者ごとの支払金額一覧.create(memberList, 算出する());
    }

    private 均一の支払金額 算出する() {
        return new 均一の支払金額(billingAmount.getValue() / memberList.合計割合を算出する().getValue());
    }
}
