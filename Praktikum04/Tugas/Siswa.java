package Praktikum04.Tugas;

public class Siswa {
    private String nis;
    private String nama;
    private double nilaiRataRata;

    public Siswa(String nis, String nama, double nilaiRataRata) {
        this.nis = nis;
        this.nama = nama;
        this.nilaiRataRata = nilaiRataRata;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        return "NIS: " + nis + " | Nama: " + nama + " | Nilai Rata-rata: " + nilaiRataRata;
    }
}