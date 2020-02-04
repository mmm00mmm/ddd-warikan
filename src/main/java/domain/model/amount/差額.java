package domain.model.amount;

public class 差額 {
    private final int value;

    public 差額(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "差額:" + value + "円";
    }

    public static 差額 算出する(BillingAmount seikyu, 合計支払金額 goukei) {
        return new 差額(seikyu.getValue() - goukei.getValue());
    }
}
