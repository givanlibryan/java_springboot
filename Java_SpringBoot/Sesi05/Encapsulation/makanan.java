package Encapsulation;

public class makanan {
    public static void main(String[] args) {
        // membuat instance/objek dari class retoran
        restoran data = new restoran();

        // membuat data pada variabel
        data.setMenu("Ayam Goreng");
        data.setharga(17000);
        data.setspesial(true);

        // memanggil method get dari class restoran dan menampilkannya
        System.out.println("Menu Makanan : " + data.getMenu());
        System.out.println("Harga Makanan: Rp. " + data.getHarga());
        System.out.println("menu Spesial : " + data.getSpesial());
    }
}
