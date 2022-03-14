package artikal.concrete;

import artikal.Artikal;

import java.time.LocalDate;

public class KucnaHemija extends Artikal {
    private LocalDate rokTrajanja;

    public LocalDate getRokTrajanja() {
        return rokTrajanja;
    }

    public void setRokTrajanja(LocalDate rokTrajanja) {
        if (rokTrajanja.isAfter(LocalDate.now()))
            this.rokTrajanja = rokTrajanja;
        else
            System.err.println("Rok trajanja mora biti u buducnosti");
    }

    @Override
    public String toString() {
        return "KucnaHemija: " + naziv;
    }
}
