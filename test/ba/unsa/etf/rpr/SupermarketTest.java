package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void prviTestZaSupermarket(){

        Supermarket market = new Supermarket();

        market.dodajArtikl(new Artikl("Automobil", 7000, "1"));
        market.dodajArtikl(new Artikl("Automobil", 7000, "2"));
        market.dodajArtikl(new Artikl("Automobil", 7000, "3"));
        market.dodajArtikl(new Artikl("Automobil", 7000, "4"));

        assertEquals(new Artikl("Automobil", 7000, "2").toString(), market.izbaciArtiklSaKodom("2").toString());
    }
}