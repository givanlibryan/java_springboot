package Assignment1;

public class PenjumlahanXY {
    public static void main(String[] args) {
        boolean hasil;
        int y1 = 4;
        int y2 = 5;
        int X1 = (y1 + y2) * (y1 + y2);
        int X2 = (y1 % 4) * y2;

        // dijadikan 1 dengan Assignment no 5b
        // apakah X1 sama besar dengan X2
        hasil = X1 == X2;
        System.out.println("X1 sama besar dengan X2 = " + hasil);

        // apakah X2 sama besar dengan X1
        hasil = X2 == X1;
        System.out.println("X2 sama besar dengan X1 = " + hasil);

        // apakah X1 mod 4 sama besar dengan ++X2 mod 5
        hasil = (X1 % 4) == (++X2 % 5);
        System.out.println("X1 mod 4 sama besar dengan ++X2 mod 5 = " + hasil);
    }
}
