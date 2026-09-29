package Praktikum03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman, int jumlahPinjaman){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP(){
        return nomorKTP;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah){
        if (jumlahPinjaman + jumlah > limitPinjaman){
            System.out.println("Maaf, jumlah peminjaman melebihi limit");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Peminjaman sebesar " + jumlah + " berhasil dilakukan");
        }
    }

    public void angsur(int jumlah){
        double minimalAngsuran = jumlahPinjaman * 0.10;

        if (jumlah < minimalAngsuran){
            System.out.println("Jumlah angsuran kurang dari minimal angsuran");
        } else if (jumlah > jumlahPinjaman){
            System.out.println("Maaf, jumlah angsuran melebihi jumlah pinjaman");
        } else {
            jumlahPinjaman -= jumlah;
            System.out.println("Angsuran sebesar " + jumlah + " berhasil dilakukan");
        }
    }
}
