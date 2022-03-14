package artikal;

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
        if (naziv != null && !naziv.isEmpty())
            this.naziv = naziv;
        else System.err.println("Naziv proizvoda ne sme biti null");
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        if (sifra > 0)
            this.sifra = sifra;
        else System.err.println("Sifra mora biti pozitivan ceo broj");
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        if (opis != null && !opis.isEmpty())
            this.opis = opis;
        else System.err.println("Opis proizvoda ne sme biti null");

    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        if (kolicina > 0)
            this.kolicina = kolicina;
        else System.err.println("Kolicina mora biti pozitivan ceo broj");
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
