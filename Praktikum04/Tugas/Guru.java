package Praktikum04.Tugas;

public class Guru {
    private String nip;
    private String nama;
    private String mapel;

    public Guru(String nip, String nama, String mapel) {
        this.nip = nip;
        this.nama = nama;
        this.mapel = mapel;
    }

    public String getNama() {
        return nama;
    }

    public String getInfo() {
        return nama + " (NIP: " + nip + ", Mapel: " + mapel + ")";
    }
}
