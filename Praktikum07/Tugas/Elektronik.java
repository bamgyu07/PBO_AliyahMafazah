package Praktikum07.Tugas;

public class Elektronik {
    public String nama;
    public String merk;
    public double harga;

    public Elektronik(){

    }

    public Elektronik(String nama, String merk, double harga){
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void getInfo(){
        System.out.println("Nama\t: " + nama);
        System.out.println("Merk\t: " + merk);
        System.out.println("Harga\t: " + harga);
    }
}