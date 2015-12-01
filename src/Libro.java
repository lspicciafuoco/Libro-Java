public class Libro {

    private String genere;

    private String titolo;

    private int pagine;

    private float prezzo;

    public Libro(String genere, String titolo, int pagine, float prezzo) {
        this.genere= genere;
        this.titolo = titolo;
        this.pagine = pagine;
        this.prezzo = prezzo;
    }

    public String getGenere() {
        return genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getPagine() {
        return pagine;
    }

    public float getPrezzo() {
        return prezzo;
    }
}
