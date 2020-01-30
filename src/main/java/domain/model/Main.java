package domain.model;

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

        System.out.println(
                合計割合.算出する(memberList).toString()
        );
    }
}
