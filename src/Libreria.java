public class Libreria {
    private Libro [] volumi;
    private int lunghezza=1000;

    public Libreria(Libro volumi[][]){
        volumi = new Libro[lunghezza];
        for (int i = 0; i < volumi.length; i++) {
            this.volumi[i] = volumi[i];
        }
    }
}
