package Assessment2;

import java.util.Scanner;

public class PenjualanBarang {
    public static void main(String args[]) {
        // Inisialisasi objek untuk masing-masing kelas
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jum = 0, i = 0;
        double total_bayar = 0;

        // Deklarasi array
        int[] kodeBarang = new int[5];
        int[] quantity = new int[5];
        int[] harga = new int[5];
        double[] disHarga = new double[5];
        double[] diskon = new double[5];
        String[] barang = new String[5];

        System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");

        System.out.print("Masukan Jumlah Beli : ");
        jum = input.nextInt();
        System.out.println(" ");

        // Memasukan elemen didalam array
        for (i = 0; i < jum; i++) {
            System.out.print("Masukan kode Barang Ke-" + (i + 1) + " : ");
            kodeBarang[i] = input.nextInt();
            System.out.print("Masukan qty Ke-" + (i + 1) + " : ");
            quantity[i] = input.nextInt();

            // Menentukan barang berdasarkan kodeBarang yang dimmasukan
            switch (kodeBarang[i]) {
                case 1:
                    barang[i] = "Mouse Bluetooth 5.0  ";
                    harga[i] = 149999;
                    diskon[i] = 0.1;
                    break;
                case 2:
                    barang[i] = "Headphone Eksternal  ";
                    harga[i] = 246000;
                    diskon[i] = 0.05;
                    break;
                case 3:
                    barang[i] = "Power Bank 10.000 mAh";
                    harga[i] = 136000;
                    diskon[i] = 0;
                    break;
                case 4:
                    barang[i] = "Tripod Kamera        ";
                    harga[i] = 267999;
                    diskon[i] = 0.2;
                    break;
                case 5:
                    barang[i] = "Smart Watch Xiomi    ";
                    harga[i] = 899000;
                    diskon[i] = 0.1;
                    break;
                default:
                    System.out.println("kode Barang Tidak Tersedia");
            }
        }

        System.out.println(" ");
        System.out.println("No   Nama Barang             Harga    QTY   Diskon   Sub Total");

        // Menampilkan seluruh elemen di dalam array
        for (i = 0; i < jum; i++) {
            disHarga[i] = ((quantity[i] * harga[i]) - (quantity[i] * harga[i] * diskon[i]));
            total_bayar += disHarga[i];
            System.out
                    .println(i + 1 + "    " + barang[i] + "   " + harga[i] + "    " + quantity[i]
                            + "     " + (int) (diskon[i] * 100) + "%" + "     " + disHarga[i]);
        }
        System.out.println(" ");

        // Menampilkan total bayar
        System.out.println("Total Bayar : " + total_bayar);
    }
}
