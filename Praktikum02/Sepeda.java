package Praktikum02;

public class Sepeda {
    int kecepatan;
    int gear;

    public Sepeda(){
        
    }

    public Sepeda(int newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }

    public void tambahKecepatan(int increment){
        kecepatan += increment;

        if (kecepatan > 20){
            kecepatan = 20;
        }
    }

    public void kurangiKecepatan(int decrement){
        kecepatan -= decrement;

        if (kecepatan < 0){
            kecepatan = 0;
        }
    }

    public void cetakInfo(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("======================");
    }
}