package domain.model.drinking_party;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DrinkingPartyDateTime {
    private final LocalDateTime value;

    public DrinkingPartyDateTime(LocalDateTime value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }
}
