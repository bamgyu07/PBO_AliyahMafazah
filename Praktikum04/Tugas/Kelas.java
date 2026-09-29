package Praktikum04.Tugas;

import java.util.ArrayList;

public class Kelas {
    private String namaKelas;
    private int kapasitas;
    private Guru waliKelas;
    private ArrayList<Siswa> daftarSiswa;

    public Kelas(String namaKelas, int kapasitas) {
        this.namaKelas = namaKelas;
        this.kapasitas = kapasitas;
        this.daftarSiswa = new ArrayList<Siswa>();
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setWaliKelas(Guru g) {
        this.waliKelas = g;
    }

    public void tambahSiswa(Siswa s) {
        if (daftarSiswa.size() < kapasitas) {
            daftarSiswa.add(s);
        } else {
            System.out.println("Kapasitas kelas " + namaKelas + " sudah penuh!");
        }
    }

    public int getJumlahSiswa() {
        return daftarSiswa.size();
    }

    public String getInfo() {
        String info = "";
        info += "--- Kelas: " + namaKelas + " (Kapasitas: " + kapasitas + ") ---\n";
        
        if (waliKelas != null) {
            info += "Wali Kelas : " + waliKelas.getInfo() + "\n";
        } else {
            info += "Wali Kelas : Belum ada wali kelas\n";
        }

        info += "Jumlah Siswa: " + getJumlahSiswa() + "\n";
        if (!daftarSiswa.isEmpty()) {
            info += "Daftar Siswa:\n";
            for (Siswa s : daftarSiswa) {
                info += "  - " + s.getInfo() + "\n";
            }
        } else {
            info += "Daftar Siswa: Belum ada siswa di kelas ini.\n";
        }
        return info;
    }
}
