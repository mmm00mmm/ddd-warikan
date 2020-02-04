package domain.model;

import domain.model.amount.BillingAmount;
import domain.model.amount.参加者ごとの支払金額一覧;
import domain.model.amount.合計支払金額;
import domain.model.amount.差額;
import domain.model.drinking_party.DrinkingParty;
import domain.model.drinking_party.DrinkingPartyDateTime;
import domain.model.drinking_party.DrinkingPartyName;
import domain.model.member.Member;
import domain.model.member.MemberList;
import domain.model.member.MemberName;
import domain.model.member.PaymentType;
import domain.model.member.SecretaryType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BillingAmount billingAmount = new BillingAmount(4000);

        Member member1 = new Member(
                new MemberName("テスト1"),
                SecretaryType.幹事以外,
                PaymentType.多め
        );

        Member member2 = new Member(
                new MemberName("テスト2"),
                SecretaryType.幹事以外,
                PaymentType.普通
        );

        Member member3 = new Member(
                new MemberName("テスト3"),
                SecretaryType.幹事以外,
                PaymentType.少なめ
        );


        List members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        members.add(member3);
        MemberList memberList = new MemberList(members);

        DrinkingParty drinkingParty = new DrinkingParty(
                new DrinkingPartyName("新年会"),
                new DrinkingPartyDateTime(LocalDateTime.of(2020, 1, 1, 19, 0, 0)),
                memberList,
                billingAmount
        );

        System.out.println(
                drinkingParty.toString() + "============================="
        );

        参加者ごとの支払金額一覧 _参加者ごとの支払金額一覧 = drinkingParty.割り勘();
        _参加者ごとの支払金額一覧.stream()
                .map(member -> member.toString())
                .forEach(System.out::print);

        System.out.println(
                "=============================" + "\n"
                        + _参加者ごとの支払金額一覧.計算する().toString()
        );

        合計支払金額 _合計支払金額 = _参加者ごとの支払金額一覧.計算する();
        System.out.println(差額.算出する(billingAmount, _合計支払金額));
    }
}
