package magacin.concrete;

import magacin.Artikal;

import java.time.LocalDate;
import java.util.Objects;

public class KucnaHemija extends Artikal {
    private LocalDate rokTrajanja;

    public LocalDate getRokTrajanja() {
        return rokTrajanja;
    }

    public void setRokTrajanja(LocalDate rokTrajanja) {
        this.rokTrajanja = rokTrajanja;
    }

    @Override
    public String toString() {
        return "KucnaHemija: " + naziv;
    }
}
