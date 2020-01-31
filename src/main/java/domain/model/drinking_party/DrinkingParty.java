package domain.model.drinking_party;

import domain.model.amount.BillingAmount;
import domain.model.amount.一つ分の支払金額;
import domain.model.amount.一人当たりの支払金額B;
import domain.model.amount.合計割合;
import domain.model.member.MemberList;
import domain.model.member.PaymentType;

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

    public void 割り勘() {
        //一人当たりの支払金額Bが返ってくる
        一人当たりの支払金額B.算出(
                一つ分の支払金額.算出する(
                        billingAmount, 合計割合.算出する(memberList)
                ),
                PaymentType.NORMAL
        );
    }
}
