package Praktikum09.Tugas;

public class Main {
    public static void main(String[] args) {

        Ikan ikan = new Ikan();

        System.out.println("=== Aktifitas Ikan ===");
        ikan.menyelam();
        ikan.berenang();
        ikan.bertelur();

        Manusia manusia = new Manusia();

        System.out.println("\n=== Aktifitas Manusia ===");
        manusia.menyelam();
        manusia.berenang();
        manusia.pakaikacamata();
    }
}