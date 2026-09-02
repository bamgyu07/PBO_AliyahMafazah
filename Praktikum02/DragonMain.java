package Praktikum02;

public class DragonMain {
    public static void main(String[] args) {
        
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("=== Dragon 1 ===");
        dragon1.printStatus();

        // Dragon 1 bergerak n langkah ke atas
        dragon1.move(3);
        dragon1.printStatus();

        // Mengubah arah menjadi ke kanan
        dragon1.changeDirection(4);
        dragon1.move(3);
        dragon1.printStatus();

        System.out.println("\n=== Dragon 2 ===");
        dragon2.printStatus();

        // Mengubah arah menjadi ke bawah
        dragon2.changeDirection(3);
        dragon2.move(4);
        dragon2.printStatus();

        // Mengubah arah menjadi ke kiri
        dragon2.changeDirection(4);
        dragon2.move(2);
        dragon2.printStatus();
    }
}