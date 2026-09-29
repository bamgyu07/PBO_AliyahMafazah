package Praktikum03;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setPlatNomor("B 0838 Xz");
        motor1.setKecepatan(50);
        motor1.displayInfo();

        Motor motor2 = new Motor();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(40);
        motor2.displayInfo();

        Motor motor3 = new Motor();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();

        Motor motor4 = new Motor();
        motor4.setPlatNomor("N 1234 ML");
        motor4.setStatusMesin(true);
        motor4.setKecepatan(125);
        motor4.displayInfo();

        Motor motor5 = new Motor();
        motor5.setPlatNomor("N 7535 PL");
        motor5.setStatusMesin(true);
        motor5.setKecepatan(-45);
        motor5.displayInfo();
    }
}
