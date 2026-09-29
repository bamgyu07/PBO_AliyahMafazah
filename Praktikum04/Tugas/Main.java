package Praktikum04.Tugas;


public class Main {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMA Negeri 1 Malang", "Jl. Tugu No. 1, Malang");

        sekolah.buatKelas("X-IPA-1", 30);
        sekolah.buatKelas("X-IPA-2", 30);

        Guru guru1 = new Guru("19850101", "Budi Santoso, S.Pd.", "Matematika");
        Guru guru2 = new Guru("19900202", "Siti Aminah, M.Pd.", "Fisika");

        Kelas kelasIPA1 = sekolah.cariKelas("X-IPA-1");
        if (kelasIPA1 != null) {
            kelasIPA1.setWaliKelas(guru1);
            
            Siswa s1 = new Siswa("1001", "Andi", 88.5);
            Siswa s2 = new Siswa("1002", "Budi", 91.0);
            Siswa s3 = new Siswa("1003", "Citra", 85.0);

            kelasIPA1.tambahSiswa(s1);
            kelasIPA1.tambahSiswa(s2);
            kelasIPA1.tambahSiswa(s3);
        }

        Kelas kelasIPA2 = sekolah.cariKelas("X-IPA-2");
        if (kelasIPA2 != null) {
            kelasIPA2.setWaliKelas(guru2);
            
            Siswa s4 = new Siswa("1004", "Dewi", 90.0);
            kelasIPA2.tambahSiswa(s4);
        }

        System.out.println(sekolah.getInfo());
    }
}