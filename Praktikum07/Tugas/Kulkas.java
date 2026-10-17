package Praktikum07.Tugas;

public class Kulkas extends Elektronik {
    public int suhu;

    public Kulkas(){

    }

    public Kulkas(String nama, String merk, double harga, int suhu){
        super(nama, merk, harga);
        this.suhu = suhu;
    }

    public int getSuhu(){
        return suhu;
    }

    public void setSuhu(int suhu){
        this.suhu = suhu;
    }

    @Override 
    public void getInfo(){
        super.getInfo();
        System.out.println("Suhu kulkas : " + suhu + " derajat celcius");
    }
}
