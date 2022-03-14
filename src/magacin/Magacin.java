package magacin;

import artikal.Artikal;
import interfejs.IMagacin;

import java.util.HashMap;
import java.util.Map;

public class Magacin implements IMagacin {

    private final Map<Integer, Artikal> artikli = new HashMap();

    @Override
    public void add(Artikal artikal) {
        if (!artikli.containsKey(artikal.getSifra()))
            artikli.put(artikal.getSifra(), artikal);
        else {
            Artikal temp = artikli.get(artikal.getSifra());
            temp.setKolicina(temp.getKolicina() + artikal.getKolicina());
        }
    }

    @Override
    public void remove(Artikal artikal) throws Exception {
        if (artikli.containsKey(artikal.getSifra())) {
            artikli.get(artikal.getSifra()).setKolicina(artikli.get(artikal.getSifra()).getKolicina() - artikal.getKolicina());
        }
        throw new Exception("Ne postoji artikal za uklanjanje");
    }

    @Override
    public Artikal find(int sifra) {
        if (sifra > 0)
            return artikli.get(sifra);
        return null;
    }
}
