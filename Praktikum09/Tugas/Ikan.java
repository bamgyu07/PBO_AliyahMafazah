package Praktikum09.Tugas;

public class Ikan implements Perenang {
    
    @Override
    public void menyelam() {
        System.out.println("Ikan sedang menyelam.");
    }

    @Override
    public void berenang() {
        System.out.println("Ikan sedang berenang.");
    }

    public void bertelur() {
        System.out.println("Ikan sedang bertelur.");
    }
}
