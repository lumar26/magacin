package magacin;

import java.util.Objects;

public class Artikal {
    protected String naziv;
    protected int sifra;
    protected String opis;
    protected int kolicina;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artikal artikal)) return false;
        return getSifra() == artikal.getSifra() && getNaziv().equals(artikal.getNaziv());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaziv(), getSifra());
    }
}
