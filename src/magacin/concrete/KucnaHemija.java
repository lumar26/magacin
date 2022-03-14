package magacin.concrete;

import magacin.Artikal;

import java.time.LocalDate;

public class KucnaHemija extends Artikal {
    private LocalDate rokTrajanja;

    public LocalDate getRokTrajanja() {
        return rokTrajanja;
    }

    public void setRokTrajanja(LocalDate rokTrajanja) {
        this.rokTrajanja = rokTrajanja;
    }
}
