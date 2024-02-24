import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KirjahyllyTest {
    Kirjahylly kirjahylly = new Kirjahylly();

    @Test
    void lisaaKirja() {
        kirjahylly.lisaaKirja("Testikirja");
        assertEquals(1, kirjahylly.getKirjojaHyllyssa());
    }

    @Test
    void viimeksiLisatty() {
        kirjahylly.lisaaKirja("Testikirja");
        assertEquals("Testikirja", kirjahylly.viimeksiLisatty());
    }

    @Test
    void onkoKirjaHyllyssa() {
        kirjahylly.lisaaKirja("Testikirja");
        assertTrue(kirjahylly.onkoKirjaHyllyssa("Testikirja"));
        assertFalse(kirjahylly.onkoKirjaHyllyssa("Ei ole olemassa"));
    }

    @Test
    void getKirjojaHyllyssa() {
        assertEquals(0, kirjahylly.getKirjojaHyllyssa());
        kirjahylly.lisaaKirja("Testikirja");
        assertEquals(1, kirjahylly.getKirjojaHyllyssa());
    }
}
