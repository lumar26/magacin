package interfejs;

import artikal.Artikal;

public interface IMagacin {
    void add(Artikal artikal);
    void remove(Artikal artikal);
    Artikal find(int sifra);
}
