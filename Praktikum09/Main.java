package Praktikum09;

public class Main {
    public static void main(String[] args) {
        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "Sharp";
        kulkas1.harga = 3500000.0;
        kulkas1.warna = "Silver";
        kulkas1.jumlahPintu = 2;

        System.out.println("=== Informasi Kulkas ===");
        kulkas1.getInfo();

        System.out.println();

        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.harga = 4200000.0;
        tv1.warna = "Hitam";
        tv1.jenisLayar = "LED";
        tv1.volume = 15;

        System.out.println("=== Informasi TV ===");
        tv1.getInfo();
    }
}
