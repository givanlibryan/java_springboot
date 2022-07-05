package Assessment2;

import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan bilangan Terbesar, Terkecil dan Rata-rata");
        System.out.print("Masukkan bilangan pertama (X): ");
        String xx = input.nextLine();
        double x = Double.parseDouble(xx);
        System.out.print("Masukkan bilangan kedua   (Y): ");
        String yy = input.nextLine();
        double y = Double.parseDouble(yy);
        System.out.print("Masukkan bilangan ketiga  (Z): ");
        String zz = input.nextLine();
        double z = Double.parseDouble(zz);
        System.out.println(" ");
        System.out.println("Hasil :");
        System.out.println("Rata-ratanya adalah " + Average(x, y, z));
        System.out.println(maxNumber(x, y, z) + " adalah bilangan terbesar");
        System.out.println(minNumber(x, y, z) + " adalah bilangan terkecil");
    }

    static double maxNumber(double a, double b, double c) {
        // method sama parameter berbeda
        // tipe data double
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }

    static int maxNumber(int a, int b, int c) {
        // method sama parameter berbeda
        // tipe data double
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }

    static double minNumber(double a, double b, double c) {
        // method sama parameter berbeda
        // tipe data double
        if (a < b && a < c) {
            return a;
        } else if (b < c && b < a) {
            return b;
        } else {
            return c;
        }
    }

    static int minNumber(int a, int b, int c) {
        // method sama parameter berbeda
        // tipe data double
        if (a < b && a < c) {
            return a;
        } else if (b < c && b < a) {
            return b;
        } else {
            return c;
        }
    }

    static double Average(double a, double b, double c) {
        // method sama parameter berbeda
        // tipe data double
        double Ave = (a + b + c) / 3;
        return Ave;
    }
}
