package Assessment2;

import java.util.Scanner;

public class TKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan Tahun Kabisat");
        System.out.print("Masukkan tahun : ");
        String xx = input.nextLine();
        int x = Integer.parseInt(xx);
        if (TentuTahun(x) == 1) {
            System.out.println("Tahun " + x + " merupakan tahun kabisat");
        } else {
            System.out.println("Tahun " + x + " bukan tahun kabisat");
        }
    }

    static int TentuTahun(int a) {
        if (a % 4 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
