import java.util.Scanner;

public class HitungBangunDatar {

    private static int HitungLuasPersegi(int sisi) {
        // Rumus Luas Persegi = sisi * sisi
        int luas = sisi * sisi;
        return luas;
    }

    private static int HitungKelilingPersegi(int sisi) {
        // Rumus Luas Persegi = sisi * sisi
        int keliling = 4 * sisi;
        return keliling;
    }

    private static int HitungLuasPersegiPanjang(int panjang, int lebar) {
        // Rumus Luas Persegi Panjang = panjang * lebar
        int luas = panjang * lebar;
        return luas;
    }

    private static int HitungKelilingPersegiPanjang(int panjang, int lebar) {
        // Rumus Luas Persegi Panjang = panjang * lebar
        int keliling = (2 * panjang) + (2 * lebar);
        return keliling;
    }

    private static double HitungLuasSegitiga(int alas, int tinggi) {
        // Rumus Luas Segitiga = 1/2 * (alas * tinggi)
        double luas = 0.5 * (alas * tinggi);
        return luas;
    }

    private static double HitungKelilingSegitiga(int alas, int tinggi) {
        // Rumus Luas Segitiga = 1/2 * (alas * tinggi)
        double c = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + c;
        return keliling;
    }

    private static double HitungLuasLingkaran(int diameter) {
        // Rumus Luas Lingkaran = phi * r * r
        // r = 1/2 * diamter (jari-jari)
        // phi bisa 22/7 dan 3.14

        double r = 0.5 * diameter;
        double luas = 0;
        if (r % 7 == 0) {
            luas = 22 * (r * r / 7);
        } else {
            luas = 3.14 * r * r;
        }
        return luas;
    }

    private static double HitungKelilingLingkaran(int diameter) {
        // Rumus Luas Lingkaran = phi * r * r
        // r = 1/2 * diamter (jari-jari)
        // phi bisa 22/7 dan 3.14

        double r = 0.5 * diameter;
        double keliling = 0;
        if (r % 7 == 0) {
            keliling = 2 * 22 * (r / 7);
        } else {
            keliling = 2 * 3.14 * r;
        }
        return keliling;
    }

    private static boolean CekValue(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Pilihan untuk hitung luas
        Scanner input = new Scanner(System.in);

        System.out.println("Silahkan pilih luas dan keliling apa yang akan anda hitung !");
        System.out.println("A. Persegi        ");
        System.out.println("B. Persegi Panjang");
        System.out.println("C. Segitiga       ");
        System.out.println("D. Lingkaran      ");
        System.out.println();
        System.out.print("Masukan pilihan anda : ");
        String choise = input.nextLine();
        System.out.println("==============================");
        switch (choise.toLowerCase()) {
            case "a":
                System.out.println("Menghitung Luas Persegi");
                System.out.print("Masukan Nilai Sisi : ");
                String sisi = input.nextLine();
                System.out.println("------------------------------");
                if (CekValue(sisi)) {
                    int s = Integer.parseInt(sisi);
                    int luas = HitungLuasPersegi(s);
                    int keliling = HitungKelilingPersegi(s);
                    System.out.println("Luas Persegi anda : " + luas);
                    System.out.println("Kelilings Persegi anda : " + keliling);
                } else {
                    System.out.println("Nilai harus integer");
                }
                break;
            case "b":
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.print("Masukan Nilai Panjang : ");
                String panjang = input.nextLine();
                System.out.print("Masukan Nilai Lebar : ");
                String lebar = input.nextLine();
                System.out.println("------------------------------");
                if (CekValue(panjang) && CekValue(lebar)) {
                    int p = Integer.parseInt(panjang);
                    int l = Integer.parseInt(lebar);
                    int luas = HitungLuasPersegiPanjang(p, l);
                    int keliling = HitungKelilingPersegiPanjang(p, l);
                    System.out.println("Luas Persegi Panjang anda : " + luas);
                    System.out.println("Keliling Persegi Panjang anda : " + keliling);
                } else {
                    System.out.println("Nilai harus integer");
                }
                break;
            case "c":
                System.out.println("Menghitung Luas Segitiga");
                System.out.print("Masukan Nilai Alas : ");
                String alas = input.nextLine();
                System.out.print("Masukan Nilai Tinggi : ");
                String tinggi = input.nextLine();
                System.out.println("------------------------------");
                if (CekValue(alas) && CekValue(tinggi)) {
                    int a = Integer.parseInt(alas);
                    int t = Integer.parseInt(tinggi);
                    double luas = HitungLuasSegitiga(a, t);
                    double keliling = HitungKelilingSegitiga(a, t);
                    System.out.println("Luas Segitiga anda : " + luas);
                    System.out.println("Keliling Segitiga anda : " + keliling);
                } else {
                    System.out.println("Nilai harus integer");
                }
                break;
            case "d":
                System.out.println("Menghitung Lingkaran");
                System.out.print("Masukan Nilai Diamter : ");
                String diameter = input.nextLine();
                System.out.println("------------------------------");
                if (CekValue(diameter)) {
                    int d = Integer.parseInt(diameter);
                    double luas = HitungLuasLingkaran(d);
                    double keliling = HitungKelilingLingkaran(d);
                    System.out.println("Luas Lingkaran anda : " + luas);
                    System.out.println("Keliling Lingkaran anda : " + keliling);
                } else {
                    System.out.println("Nilai harus integer");
                }
                break;
            default:
                System.out.println("Pilihan anda tidak ada");
        }
        System.out.println("==============================");
    }

}
