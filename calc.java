package Calculator;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию вы хотите выполнить? (+,-)");
        String work = scanner.next();
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        int c = 0;
        switch (work) {
            case "+":
                c = a + b;
                System.out.println("Ответ: " + c + ".");
                break;
            case "-":
                c = a - b;
                System.out.println("Ответ: " + c + ".");
                break;

            default:
                System.out.println("Недопустимая операция.");
                break;
        }
        scanner.close();
    }
}