import java.util.Scanner;

public class Lesson01 {
    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 5;
        int sum = value1 + value2;

        System.out.println("Сумма " + sum);

        int multiply = value1*value2;
        System.out.println("Произведение " + multiply);

        int difference = value1-value2;
        System.out.println("Разница " + difference);

        Scanner scanner = new Scanner(System.in);

    }
}
