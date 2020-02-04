package domain.model.amount;

public class 合計支払金額 {
    private final int value;

    public 合計支払金額(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "合計支払金額:" + value + "円";
    }
}
