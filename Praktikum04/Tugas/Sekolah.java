package Praktikum04.Tugas;

import java.util.ArrayList;

public class Sekolah {
    private String nama;
    private String alamat;
    private ArrayList<Kelas> daftarKelas;

    public Sekolah(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarKelas = new ArrayList<Kelas>();
    }

    public void buatKelas(String nama, int kapasitas) {
        Kelas kelasBaru = new Kelas(nama, kapasitas);
        daftarKelas.add(kelasBaru);
    }

    public Kelas cariKelas(String nama) {
        for (Kelas k : daftarKelas) {
            if (k.getNamaKelas().equalsIgnoreCase(nama)) {
                return k;
            }
        }
        return null;
    }

    public int getJumlahKelas() {
        return daftarKelas.size();
    }

    public String getInfo() {
        String info = "";
        info += "========================================\n";
        info += "Nama Sekolah : " + nama + "\n";
        info += "Alamat       : " + alamat + "\n";
        info += "Jumlah Kelas : " + getJumlahKelas() + "\n";
        info += "========================================\n\n";

        if (!daftarKelas.isEmpty()) {
            for (Kelas k : daftarKelas) {
                info += k.getInfo() + "\n";
            }
        } else {
            info += "Belum ada kelas terdaftar.\n";
        }
        return info;
    }
}
