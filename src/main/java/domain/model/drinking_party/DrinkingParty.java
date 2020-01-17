package domain.model.drinking_party;

import domain.model.amount.BillingAmount;
import domain.model.member.MemberList;

public class DrinkingParty {
    private final DrinkingPartyName drinkingPartyName;
    private final DrinkingPartyDateTime drinkingPartyDateTime;
    private final MemberList memberList;
    private final BillingAmount billingAmount;

    public DrinkingParty(DrinkingPartyName drinkingPartyName,
                         DrinkingPartyDateTime drinkingPartyDateTime,
                         MemberList memberList,
                         BillingAmount billingAmount) {
        this.drinkingPartyName = drinkingPartyName;
        this.drinkingPartyDateTime = drinkingPartyDateTime;
        this.memberList = memberList;
        this.billingAmount = billingAmount;
    }
}
