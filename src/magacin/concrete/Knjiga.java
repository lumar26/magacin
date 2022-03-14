package magacin.concrete;

import magacin.Artikal;

public class Knjiga extends Artikal {

    @Override
    public String toString() {
        return "Knjiga: " + super.naziv;
    }
}
