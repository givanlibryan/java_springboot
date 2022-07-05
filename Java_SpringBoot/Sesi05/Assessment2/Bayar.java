package Assessment2;

import java.util.Scanner;

public class Bayar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan Harga bayar dengan disertai diskon");
        System.out.print("Pembelian : Rp. ");
        String xx = input.nextLine();
        double x = Double.parseDouble(xx);
        System.out.print("Diskon(%) : ");
        String yy = input.nextLine();
        double y = Double.parseDouble(yy);
        System.out.println("Harga Bayar : Rp. " + HargaBayar(x, y));
    }

    static double HargaBayar(double a, double b) {
        double diskon = (b / 100) * a;
        double hargaAkhir = a - diskon;
        return hargaAkhir;
    }
}
