package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void prviTestZaKorpu(){

        Korpa nova_korpa = new Korpa();

        assertTrue(nova_korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1")));
    }

    @Test
    void drugiTestZaKorpu(){

        Korpa prva_korpa = new Korpa(), druga_korpa = new Korpa();

        prva_korpa.dodajArtikl(new Artikl("autic", 10, "1"));
        prva_korpa.dodajArtikl(new Artikl("motor", 1000, "2"));
        prva_korpa.dodajArtikl(new Artikl("automobil", 10000, "3"));
        prva_korpa.dodajArtikl(new Artikl("bicikl", 100, "4"));

        druga_korpa.dodajArtikl(new Artikl("autic", 10, "1"));
        druga_korpa.dodajArtikl(new Artikl("motor", 1000, "2"));
        druga_korpa.dodajArtikl(new Artikl("automobil", 10000, "3"));
        druga_korpa.dodajArtikl(new Artikl("bicikl", 100, "4"));


        assertEquals(prva_korpa.dajUkupnuCijenuArtikala(), druga_korpa.dajUkupnuCijenuArtikala());
    }
}