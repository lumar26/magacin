package magacin;

import artikal.Artikal;
import interfejs.IMagacin;

import java.util.HashMap;
import java.util.Map;

public class Magacin implements IMagacin {

    private final Map<Integer, Artikal> artikli = new HashMap();

    @Override
    public void add(Artikal artikal) {
        if (artikli.containsKey(artikal.getSifra())) {
            Artikal temp = artikli.get(artikal.getSifra());
            temp.setKolicina(temp.getKolicina() + artikal.getKolicina());
        } else {
            artikli.put(artikal.getSifra(), artikal);
        }
    }

    @Override
    public void remove(Artikal artikal) throws Exception {
        if (!artikli.containsKey(artikal.getSifra())) {
            Artikal temp = artikli.get(artikal.getSifra());
            temp.setKolicina(temp.getKolicina() + artikal.getKolicina());
            throw new Exception("Ne postoji artikal za uklanjanje");
        }
        artikli.get(artikal.getSifra()).setKolicina(artikli.get(artikal.getSifra()).getKolicina() - artikal.getKolicina());
    }

    @Override
    public Artikal find(int sifra) {
        return artikli.get(sifra);
    }
}
