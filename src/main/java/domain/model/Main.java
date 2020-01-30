package domain.model;

import domain.model.amount.BillingAmount;
import domain.model.amount.一つ分の支払金額;
import domain.model.amount.合計割合;
import domain.model.member.Member;
import domain.model.member.MemberList;
import domain.model.member.MemberName;
import domain.model.member.PaymentType;
import domain.model.member.SecretaryType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BillingAmount billingAmount = new BillingAmount(4000);
        Member member1 = new Member(
                new MemberName("テスト"),
                SecretaryType.幹事以外,
                PaymentType.NORMAL
        );

        Member member2 = new Member(
                new MemberName("テスト2"),
                SecretaryType.幹事以外,
                PaymentType.NORMAL
        );

        List members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        MemberList memberList = new MemberList(members);

        合計割合 _合計割合 = 合計割合.算出する(memberList);
        System.out.println(_合計割合.toString());
        一つ分の支払金額 _一つ分の支払金額 = 一つ分の支払金額.算出する(billingAmount, _合計割合);
        System.out.println(_一つ分の支払金額.toString());
    }
}
