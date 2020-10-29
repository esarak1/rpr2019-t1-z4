package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Artikl> korpa;

    public Korpa(){

        korpa = new ArrayList<Artikl>();
    }

    public boolean dodajArtikl(Artikl a) {

        if(korpa.size() == 50) return false;

        korpa.add(a);
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        Artikl pom = null;

        for (int i = 0; i < korpa.size(); i++)
            if (korpa.get(i).getKod().equals(kod))
                pom = korpa.get(i);

        korpa.remove(pom);

        return pom;
    }

    public Artikl[] getArtikli() {

        return korpa.toArray(new Artikl[0]);
    }

    public int dajUkupnuCijenuArtikala() {

        int ukupna=0;

        for(int i=0; i<korpa.size(); i++) ukupna += korpa.get(i).getCijena();

        return ukupna;
    }
}
