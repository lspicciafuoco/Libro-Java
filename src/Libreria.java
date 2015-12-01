public class Libreria {

    public static void main(String args[]) {
        Libro libro = new Libro("Poliziesco", "1732", 366, 17.90f);
        
    
        Autore autore = new Autore(1, "Gilbert Keith ");
        
    
        autore.setLibri(libro);
        
        autore.acquista(libro);
        
         System.out.println(autore.toString());
        
        System.out.println(Autore.genere);
    }
}

    

