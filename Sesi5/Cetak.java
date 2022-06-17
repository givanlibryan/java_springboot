public class Cetak {
    public static void main(String[] args) {
        // Buat object referensi class manusia dengan cons cowok
        Manusia cowok = new Cowok();

        // menampilkan output pada method yang ada di class cowok
        cowok.nyanyiLagu();

        // Buat object referensi class manusia dengan cons cewekk
        Manusia cewek = new Cewek();

        // menampilkan output pada method yang ada di class cewek
        cewek.nyanyiLagu();
    }
}
