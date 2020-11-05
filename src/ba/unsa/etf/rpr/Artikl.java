package ba.unsa.etf.rpr;

public class Artikl {

    private String naziv,kod;
    private int cijena;

    public Artikl(String s, int i, String k) {

        naziv = s;
        cijena = i;
        kod = k;
    }

    public String getNaziv(){

        return naziv;
    }

    public String getKod(){

        return kod;
    }

    public int getCijena(){

        return cijena;
    }

    @Override
    public String toString() {
        return "Artikl{" +
                "naziv='" + naziv + '\'' +
                ", kod='" + kod + '\'' +
                ", cijena=" + cijena +
                '}';
    }
}
