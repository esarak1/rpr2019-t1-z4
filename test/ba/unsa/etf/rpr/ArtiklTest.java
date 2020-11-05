package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void prviTestZaArtikl(){

        Artikl prvi = new Artikl("Biciklo", 1000, "1");
        //Artikl drugi = new Artikl("Biciklo", 1000, "1");

        assertEquals("Biciklo", prvi.getNaziv());
    }
}