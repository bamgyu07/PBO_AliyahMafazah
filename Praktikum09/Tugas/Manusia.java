package Praktikum09.Tugas;

public class Manusia implements Perenang {

    @Override
    public void menyelam() {
        System.out.println("Manusia sedang menyelam.");
    }

    @Override
    public void berenang() {
        System.out.println("Manusia sedang berenang.");
    }

    public void pakaikacamata() {
        System.out.println("Manusia sedang memakai kacamata renang.");
    }
}