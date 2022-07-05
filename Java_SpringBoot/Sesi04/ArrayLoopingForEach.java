import java.util.Scanner;

public class ArrayLoopingForEach {
    public static void main(String[] args) {

        // membuat array it profesi
        String[] itprofesi = new String[5];

        // membuat Scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for (int i = 0; i < itprofesi.length; i++) {
            System.out.print("Buah ke-" + i + ": ");
            itprofesi[i] = scan.nextLine();
        }
        System.out.println("=====================");
        for (String b : itprofesi) {
            System.out.println(b);
        }
    }
}
