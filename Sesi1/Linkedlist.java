import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> buah = new LinkedList<>();

        buah.addFirst("Jeruk");
        buah.add("Semangka");
        buah.add("Pisang");
        buah.add("Mangga");
        buah.add("Rambutan");
        buah.add("Belimbing");
        buah.add("Nangka");

        System.out.println("Buah :" + buah);

        System.out.println("Jumlah buah :" + buah.size());

        buah.addFirst("Paling Atas");
        buah.addLast("Paling Bawah");

        buah.set(2, "Diubah");
        buah.set(5, "Diubah");

        System.out.println("Nama Buah: " + buah);

        // Menambahkan Data pada Objek buah
        buah.add("Jeruk"); // No Index 0
        buah.add("Jambu"); // No Index 1
        buah.add("Apel"); // No Index 2
        buah.add("Melon"); // No Index 3
        buah.add("Semangka "); // No Index 4

        // Mengambil Data pada Urutan Teratas
        System.out.println("Data Teratas: " + buah.getFirst());
        // Mengambil Data pada Urutan Terbawah
        System.out.println("Data Terbawah: " + buah.getLast());
        // Mengambil Data pada Nomor Index 1
        System.out.println("Data NoIndex 1: " + buah.get(1));
        // Mengambil Data pada Nomor Index 3
        System.out.println("Data NoIndex 3: " + buah.get(3));

        // Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.removeFirst();// Menghapus Data pada Urutan Paling Atas
        buah.removeLast(); // Menghapus Data pada Urutan Paling Bawah
        buah.remove(1);// Menghapus Data pada No ndex 1

        // Mencetak Data
        System.out.println(buah);
    }
}