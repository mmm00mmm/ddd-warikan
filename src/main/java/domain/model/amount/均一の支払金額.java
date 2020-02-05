package domain.model.amount;

import domain.model.rate.合計割合;

public class 均一の支払金額 {
    private final int value;

    public 均一の支払金額(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
