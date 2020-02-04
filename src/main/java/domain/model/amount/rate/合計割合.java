package domain.model.amount.rate;

public class 合計割合 {
    private final Integer value;

    public 合計割合(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public Integer getValue() {
        return value;
    }

}
