package Praktikum08.Tugas;

public abstract class Elektronik {
    public String nama;
    public String merk;
    public double harga;

    public Elektronik() {
    }

    public Elektronik(String nama, String merk, double harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void getInfo();
}
