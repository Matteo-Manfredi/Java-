public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
public class Mensola {
    private Libro volumi[];
    private final int NUM_MAX_VOLUMI = 15;

    public Mensola() {
        volumi = new Libro[NUM_MAX_VOLUMI];
    }

    public Mensola(Libro volumi[]) {
        volumi = new Libro[NUM_MAX_VOLUMI];
        for (int i = 0; i < volumi.length; i++) {
            this.volumi[i] = volumi[i];
        }
    }

    public Mensola(Mensola mensola) {
        volumi = new Libro[NUM_MAX_VOLUMI];
        for (int i = 0; i < mensola.volumi.length; i++) {
            volumi[i] = mensola.getVolume(i).getCopyDeep();
        }
    }

    public int setVolumi(Libro volume, int posizione) {
        if (posizione > volumi.length || posizione < 0) {
            return -1;
        } else if (volumi[posizione] != null) {
            return -2;
        } else {
            volumi[posizione] = volume;
            return posizione;
        }
    }

    public Libro getVolume(int posizione) {
        return volumi[posizione];
    }

    public int rimuoviVolume(int posizione) {
        // NO CICLI
        if (posizione > volumi.length || posizione < 0) {
            return -1;
        } else if (volumi[posizione] == null) {
            return -2;
        } else {
            volumi[posizione] = null;
        }
        return posizione;
    }

    public int getNumMaxVolumi() {
        return NUM_MAX_VOLUMI;
    }

    public int getNumVolumi() {
        int numeroV = 0;
        for (int i = 0; i < volumi.length; i++) {
            if (volumi[i] != null) { // NO EQUALS (equals negli indirizzi non ha significato)
                numeroV++;
            }
        }
        return numeroV;
    }

    public int TrovaLibroPerParola(String parola) {
        int risultato = -1;
        int i = 0;
        while (i < volumi.length && risultato == -1) {
            // Sequenza di comandi --> chain method
            if (volumi[i] != null && volumi[i].getTitolo().toLowerCase().contains(parola.toLowerCase())) {
                risultato = i;
            }
            i++;
        }
        return risultato;
    }

    public int ContaVocaliPerTitolo(int posizione) {
        int risultato = 0;
        if (volumi[posizione] != null) {
            for (int i = 0; i < volumi[posizione].getTitolo().length(); i++) {
                if (volumi[posizione].getTitolo().charAt(i) == 'a' || volumi[posizione].getTitolo().charAt(i) == 'e'
                        || volumi[posizione].getTitolo().charAt(i) == 'i'
                        || volumi[posizione].getTitolo().charAt(i) == 'o'
                        || volumi[posizione].getTitolo().charAt(i) == 'u') {
                        risultato++;
                    }
                }
            } else {
                risultato = -1;
            }
        return risultato;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < volumi.length; i++) {
            if (volumi[i] != null)
                s += "La mensola in posto " + i + " contiene: " + "\n" + volumi[i]+ "\n";
        }
        return s;
    }
}