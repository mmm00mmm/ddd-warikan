package domain.model.member;

public class MemberName {
    private final String value;

    public MemberName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
