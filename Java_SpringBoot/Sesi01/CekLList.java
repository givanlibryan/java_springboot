import java.util.LinkedList;

public class CekLList {
    public static void main(String[] args) {

        // Membuat Instance /Objek dari LinkedList
        LinkedList<String> barang = new LinkedList<>();

        // Menambahkan Data pada Objek buah
        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");

        // Mengecek Apakah Data pada Objek barang. Kosong
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("Data Penuh");
        }

        // Mengecek Apakah Sebuah Element ada Didalam LingkedList
        if (barang.contains("Komputer")) {
            System.out.println("Barang Ditemukan");
        } else {
            System.out.println("Barang Tidak Ditemukan");
        }
    }
}