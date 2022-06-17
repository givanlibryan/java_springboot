import java.util.Scanner;

public class LampuLalulintas {
    public static void main(String[] args) {

        // membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("lampu kuning, hati-hati!");
                break;
            case "hijau":
                System.out.println("hijau, jalan!");
                break;
            default:
                System.out.println("warna lampu salah!");
        }
    }
}
