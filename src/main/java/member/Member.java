package member;

public class Member {
    private final MemberName memberName;
    private final SecretaryType secretaryType;

    public Member(MemberName memberName, SecretaryType secretaryType) {
        this.memberName = memberName;
        this.secretaryType = secretaryType;
    }
}
