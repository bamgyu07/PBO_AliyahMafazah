package Praktikum08.Tugas;

public class Kulkas extends Elektronik {
    public int suhu;

    public Kulkas() {
    }

    public Kulkas(String nama, String merk, double harga, int suhu) {
        super(nama, merk, harga);
        this.suhu = suhu;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    @Override
    public void getInfo() {
        System.out.println("Nama        : " + nama);
        System.out.println("Merk        : " + merk);
        System.out.println("Harga       : " + harga);
        System.out.println("Suhu kulkas : " + suhu + " derajat celcius");
    }
}
