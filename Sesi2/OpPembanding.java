public class OpPembanding {
    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        // apakah A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        // apakah A lebih besar sama dengan B?
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        // apakah A lebih kecil sama dengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        // apakah A sama dengan B?
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        // apakah A tidak sama dengan B?
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);
    }
}