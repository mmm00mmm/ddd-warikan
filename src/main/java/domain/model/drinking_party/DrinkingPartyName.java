package domain.model.drinking_party;

public class DrinkingPartyName {
    private final String value;

    public DrinkingPartyName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
