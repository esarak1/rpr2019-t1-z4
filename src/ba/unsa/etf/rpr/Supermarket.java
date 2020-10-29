package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {

    private int n;
    private ArrayList<Artikl> artikli;

    public Supermarket(){

        artikli = new ArrayList<Artikl>();
    }

    public void dodajArtikl(Artikl a){

        artikli.add(a);
    }

    public Artikl[] getArtikli(){

        return artikli.toArray(new Artikl[0]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl pom = null;

        for (int i = 0; i < artikli.size(); i++)
            if (artikli.get(i).getKod().equals(kod))
                pom = artikli.get(i);

        artikli.remove(pom);

        return pom;
    }
}
