package Praktikum08.Tugas;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        laptop.setNama("ThinkPad");
        laptop.merk = "Lenovo";
        laptop.harga = 7000000;
        laptop.setProcessor("Intel Core i7");

        System.out.println("Informasi Laptop");
        laptop.getInfo();
        System.out.println();

        Kulkas kulkas = new Kulkas();

        kulkas.setNama("Kulkas 2 pintu");
        kulkas.merk = "LG";
        kulkas.harga = 7000000;
        kulkas.setSuhu(-5);

        System.out.println("Informasi Kulkas");
        kulkas.getInfo();
        System.out.println();
    }
}
