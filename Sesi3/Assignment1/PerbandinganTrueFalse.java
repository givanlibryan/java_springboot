package Assignment1;

public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        // buat variabel
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;
        boolean hasil;

        // apakah a lebih besar dari b => true
        hasil = a > b;
        System.out.println("Tes ke 1 = " + hasil);

        // apakah b lebih kecil dari c => true
        hasil = b < c;
        System.out.println("Tes ke 2 = " + hasil);

        // apakah c lebih besar sama dengan d => true
        hasil = c >= d;
        System.out.println("Tes ke 3 = " + hasil);

        // apakah d lebih kecil sama dengan a => true
        hasil = d <= a;
        System.out.println("Tes ke 4 = " + hasil);

        // apakah a dikurangi b sama dengan c dikurangi a => true
        hasil = (a - b) == (c - a);
        System.out.println("Tes ke 5 = " + hasil);

        // apakah c tidak sama dengan d => true
        hasil = c != d;
        System.out.println("Tes ke 6 = " + hasil);

        // apakah b lebih besari dari a => false
        hasil = b > a;
        System.out.println("Tes ke 7 = " + hasil);

        // apakah a kurang dari sama dengan b => false
        hasil = a <= b;
        System.out.println("Tes ke 8 = " + hasil);

        // apakah a sama dengan b => false
        hasil = a == b;
        System.out.println("Tes ke 9 = " + hasil);

        // apakah a dikurangi b tidak sama dengan c dikurangi a => false
        hasil = (a - b) != (c - a);
        System.out.println("Tes ke 10 = " + hasil);
    }
}
