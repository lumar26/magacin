package artikal.concrete;

import artikal.Artikal;

public class Knjiga extends Artikal {

    @Override
    public String toString() {
        return "Knjiga: " + super.naziv;
    }
}
