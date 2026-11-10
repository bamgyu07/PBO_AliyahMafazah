package Praktikum10;

public class Demo {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("19940201", "Widia S.Kom. M.kom", "199402");
        
        Pegawai pegawai1 = dosen1;

        System.out.println();
        System.out.println(pegawai1.nip);
        System.out.println(pegawai1.nama);
        pegawai1.displayInfo();

        System.out.println();

        Dosen newdosen = (Dosen) pegawai1;

        System.out.println(newdosen.nama);
        System.out.println(newdosen.nidn);
        newdosen.mengajar();
    }
}
