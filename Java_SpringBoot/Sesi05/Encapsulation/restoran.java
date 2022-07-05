package Encapsulation;

public class restoran {
    // variabel (private)
    private String menu;
    private double harga;
    private boolean spesial;

    // Method Setter Public dengan params
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }

    public void setspesial(boolean spesial) {
        this.spesial = spesial;
    }

    // Method Getter (public)
    public String getMenu() {
        return menu;
    }

    public double getHarga() {
        return harga;
    }

    public boolean getSpesial() {
        return spesial;
    }

}
// public class makanan {
// public static void main(String[] args) {
// // membuat instance/objek dari class retoran
// restoran data = new restoran();

// // membuat data pada variabel
// data.setMenu("Ayam Goreng");
// data.setharga(17.000);
// data.setspesial(true);

// // memanggil method get dari class restoran dan menampilkannya
// System.out.println("Menu Makanan : " + data.getMenu());
// System.out.println("Harga Makanan Rp. " + data.getHarga());
// System.out.println("menu Spesial : " + data.getSpesial());
// }
// }