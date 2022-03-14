package main;

import artikal.Artikal;
import artikal.concrete.Knjiga;
import artikal.concrete.KucnaHemija;
import interfejs.IMagacin;
import magacin.Magacin;

public class Main {
    public static void main(String[] args) {
        IMagacin magacin = new Magacin();
        Artikal knjiga = new Knjiga();
        Artikal knjiga2 = new Knjiga();
        Artikal knjiga3 = new Knjiga();
        Artikal knjiga4 = new Knjiga();
        knjiga.setNaziv("Grof Monte Kristo");
        knjiga.setKolicina(2);
        knjiga.setSifra(1);
        knjiga2.setNaziv("Braca Karamazovi");
        knjiga2.setKolicina(6);
        knjiga2.setSifra(2);
        knjiga3.setNaziv("Zapisi iz Podzemlja");
        knjiga3.setKolicina(4);
        knjiga3.setSifra(12);
        knjiga4.setNaziv("Tako je govorio Zaratustra");
        knjiga4.setKolicina(1);
        knjiga4.setSifra(4);

        magacin.add(knjiga);
        magacin.add(knjiga2);
        magacin.add(knjiga3);
        magacin.add(knjiga4);

        System.out.println(magacin.find(2));
        System.out.println(magacin.find(12));

        Artikal sapun = new KucnaHemija();
        sapun.setSifra(124);
        sapun.setNaziv("Dove");
        sapun.setKolicina(6);

        magacin.add(sapun);
        System.out.println(magacin.find(124));


    }
}
