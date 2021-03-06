package rs.aleph.android.example12.model;

/**
 * Created by KaraklicDM on 12.10.2017.
 */

public class Jelo {
    private String slika;
    private String naziv;
    private String opisJela;
    private String kategorija;
    private float kalorijskaVrednost;
    private float cena;
    private float ocena;
    private String sastojci;



    public Jelo() {
    }

    public Jelo(String slika, String naziv, String opisJela, String kategorija, float kalorijskaVrednost, float cena,float ocena,String sastojci) {
        this.slika = slika;
        this.naziv = naziv;
        this.opisJela = opisJela;
        this.kategorija = kategorija;
        this.kalorijskaVrednost = kalorijskaVrednost;
        this.cena = cena;
        this.ocena = ocena;
        this.sastojci = sastojci;
    }




    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpisJela() {
        return opisJela;
    }

    public void setOpisJela(String opisJela) {
        this.opisJela = opisJela;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }



    public float getKalorijskaVrednost() {
        return kalorijskaVrednost;
    }

    public void setKalorijskaVrednost(float kalorijskaVrednost) {
        this.kalorijskaVrednost = kalorijskaVrednost;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Jela{" +
                "naziv='" + naziv + '\'' +
                ", opisJela='" + opisJela + '\'' +
                ", kategorija='" + kategorija + '\'' +
                ", kalorijskaVrednost=" + kalorijskaVrednost +
                ", cena=" + cena +
                '}';
    }

    public float getOcena() {
        return ocena;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }


    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getSastojci() {
        return sastojci;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }
}
