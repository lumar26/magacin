package interfejs;

import artikal.Artikal;

public interface IMagacin {
    void add(Artikal artikal);
    void remove(Artikal artikal) throws Exception;
    Artikal find(int sifra);
}
