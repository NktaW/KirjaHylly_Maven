import java.util.ArrayList;

/**
 * Luokka mallintaa yksinkertaista kirjahyllyä
 */
public class Kirjahylly {
    private ArrayList<String> kirjat;

    private int kirjojaHyllyssa = 0;

    public Kirjahylly() {
        kirjat = new ArrayList<>();
        kirjojaHyllyssa = 0;
    }

    /**
     * Lisää yhden kirjan hyllyyn
     * @param kirja lisättävä kirja
     */
    public void lisaaKirja(String kirja) {
        kirjat.add(kirja);
        kirjojaHyllyssa++;
    }

    /**
     * Palauttaa kirjahyllyyn viimeksi lisätyn kirjan
     * @return viimeksi lisätyn kirjan
     */
    public String viimeksiLisatty() {
        return kirjat.get(0);
    }

    /**
     * Palauttaa tiedon siitä onko annettu kirja hyllyssä
     * @param kirja kirja, jota etsitään
     * @return <code>true</code>, jos kirjan on hyllyssä, muuten <code>false</code>
     */
    public boolean onkoKirjaHyllyssa(String kirja) {
        for (String k : kirjat) {
            if (k.equals(kirja)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Palautta kirjahyllyssä olevien kirjojen määrän
     * @return kirjojen määrän hyllyssä
     */
    public int getKirjojaHyllyssa() {
        return kirjojaHyllyssa;
    }
}
