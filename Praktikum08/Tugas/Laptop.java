package Praktikum08.Tugas;

public class Laptop extends Elektronik {
    public String processor;

    public Laptop() {
    }

    public Laptop(String nama, String merk, double harga, String processor) {
        super(nama, merk, harga);
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void getInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Merk       : " + merk);
        System.out.println("Harga      : " + harga);
        System.out.println("Processor  : " + processor);
    }
}
