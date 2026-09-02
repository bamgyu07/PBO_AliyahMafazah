package Praktikum02;

public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon(){
        x = 0;
        y = 0;
        direction = 1;
    }

    void changeDirection(int newDirection){
        if (newDirection >= 1 && newDirection <=4){
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // ke atas
                y += steps;
                break;

            case 2: // ke kanan
                x += steps;
                break;

            case 3: // bawah
                y -= steps;
                break;

            case 4: // kiri
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        String arah;

        switch (direction) {
            case 1:
                arah = "atas";
                break;
            case 2:
                arah = "kanan";
                break;
            case 3:
                arah = "bawah";
                break;
            case 4:
                arah = "kiri";
                break;
            default:
                arah = "tidak diketahui";
        }

        System.out.println("Posisi: (" + x + ", " + y + ")");
        System.out.println("Arah: " + arah);
        System.out.println(" ");
    }
}