import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KirjahyllyTest {
    Kirjahylly kirjahylly = new Kirjahylly();

    @Test
    //lisaaKirja-testissä lisätään kirja ja tarkistetaan, että kirjojen määrä on kasvanut.
    void lisaaKirja() {
        kirjahylly.lisaaKirja("Testikirja");
        assertEquals(1, kirjahylly.getKirjojaHyllyssa());
    }

    @Test
    //viimeksiLisatty-testissä lisätään kirja ja tarkistetaan, että viimeksi lisätty kirja on oikea.
    void viimeksiLisatty() {
        kirjahylly.lisaaKirja("Testikirja");
        assertEquals("Testikirja", kirjahylly.viimeksiLisatty());
    }

    @Test
    //onkoKirjaHyllyssa-testissä lisätään kirja ja tarkistetaan, että kirja löytyy hyllystä.
        // Lisäksi tarkistetaan, että kirja, jota ei ole lisätty, ei löydy hyllystä.
    void onkoKirjaHyllyssa() {
        kirjahylly.lisaaKirja("Testikirja");
        assertTrue(kirjahylly.onkoKirjaHyllyssa("Testikirja"));
        assertFalse(kirjahylly.onkoKirjaHyllyssa("Ei ole olemassa"));
    }

    @Test
    //getKirjojaHyllyssa-testissä tarkistetaan, että aluksi kirjoja ei ole hyllyssä.
        // Lisätään kirja ja tarkistetaan, että kirjojen määrä on kasvanut.
    void getKirjojaHyllyssa() {
        assertEquals(0, kirjahylly.getKirjojaHyllyssa());
        kirjahylly.lisaaKirja("Testikirja");
        assertEquals(1, kirjahylly.getKirjojaHyllyssa());
    }
}
