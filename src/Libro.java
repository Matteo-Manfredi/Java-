public class Libro {
    private String titolo;
    private String autore;
    private String editore;
    private int anno;


    public Libro() {
    }

    public Libro(String titolo, String autore, int numeroPagine, String editore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.editore= editore;
        this.anno = anno;
    }

    public Libro(Libro l) {
        titolo = l.titolo;
        autore = l.autore;
        editore = l.editore;
        anno= l.anno;
        
    }

    // Get titolo
    public String getTitolo() {
        return titolo;
    }

    // Set titolo
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    // Get autore
    public String getAutore() {
        return autore;
    }

    // Set autore
    public void setAutore(String autore) {
        this.autore = autore;
    }

    // Get anno
    public int getAnno() {
        return anno;
    }

    // Set anno
    public void setNumeroPagine(int anno) {
        this.anno = anno;
    }
    
    
    // Get autore
    public String getEditore() {
        return autore;
    }

    // Set autore
    public void setEditore(String editore) {
        this.editore = editore;
    }

    // toString
    public String toString() {
        String s = "Titolo del libro - " + titolo + "\n" + "Autore del libro - " + autore + "\n" + "Numero delle pagine - "
                + "Anno pubblicazione - " + anno+ "\n"+ "Editore - "+ editore;
        return s;
    }

//     // autore e titolo uguali per equals
//     public boolean equals(String autore, String titolo) {
//         boolean r = false;
//         if (this.autore == autore) {
//             r = true;
//         } else {
//             if (this.titolo == titolo) {
//                 r = true;
//             }
//         }

//         return r;
//     }

//     public Libro getCopySh() {
//         return this;
//     }

//     public Libro getCopyDeep() {
//         return new Libro(getTitolo(), getAutore(), getNumeroPagine());
//     }
}