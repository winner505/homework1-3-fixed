package kz.kaznu.aisha.hw1_3;

public class MainApplication {
    public static void main(String[] args) {
        selectColor();
    }

    public static void selectColor() {
        int data = 25;

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}