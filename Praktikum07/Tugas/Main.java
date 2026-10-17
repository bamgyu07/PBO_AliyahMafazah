package Praktikum07.Tugas;

public class Main {
    public static void main(String[] args){
        Laptop laptop = new Laptop();

        System.out.println(" ");
        laptop.setNama("ThinkPad");
        laptop.merk = "Lenovo";
        laptop.harga = 7000000;
        laptop.setProcessor("Intel Core i7");
        laptop.getInfo();

        System.out.println(" ");
        System.out.println("----------");
        System.out.println(" ");

        Kulkas kulkas = new Kulkas();
        kulkas.setNama("Kulkas 2 pintu");
        kulkas.merk = "LG";
        kulkas.harga = 8500000;
        kulkas.setSuhu(-4);
        kulkas.getInfo();
        System.out.println(" ");
    }
}
