public class Autore {

    private int ID;

    private String nome;

    private int suoiLibriLibreria;

    private String[] titoli= new String[100];
    
    public static String genere = "Poliziesco"; 

    public Autore(int ID, String nome) {
        
         this.ID = ID;
        this.nome = nome;
        suoiLibriLibreria = 0;
    }

    public void setLibri(Libro libro){
        titoli[suoiLibriLibreria] = libro.getTitolo();
        suoiLibriLibreria++;
    }
    
    public String toString() {
        String stringa;
        stringa = "ID : " + this.ID + ";\n";
        stringa += "Nome : " + this.nome + ";\n";
        stringa += "Numero Libri : " + this.suoiLibriLibreria + ";\n";
        stringa += "Elenco libri : \n";
        for(int i = 0; i < suoiLibriLibreria; i++)
            stringa += "\t'" + this.titoli[i] + "'\n";
        return stringa;
    }

    public void acquista(Libro libro) {
        System.out.println("Hai acquistato il lbro '" + libro.getTitolo() + "' a " + libro.getPrezzo() + "€\n");
    }
}
