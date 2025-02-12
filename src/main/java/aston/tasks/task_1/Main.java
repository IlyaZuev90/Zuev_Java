package aston.tasks.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода
        Scanner scanner = new Scanner(System.in);

        // Вводим два целых числа
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();

        // Сравниваем числа и выводим результат
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("b - a = " + (b - a));

        // Проверка на деление на ноль перед делением
        if (b != 0) {
            // Проверка наличия остатка от деления
            if ((a % b) != 0) {
                // Делим a на b, если деление не целое, выводим результат с двумя знаками после запятой
                double r = (double) a / b;
                String formattedR = String.format("%.2f", r);
                System.out.println("a / b = " + formattedR);
            } else {
                System.out.println("a / b = " + (a / b));
            }
        } else {
            System.out.println("Деление на ноль невозможно (a / b).");
        }

        if (a != 0) {
            // Проверка наличия остатка от деления
            if ((b % a) != 0) {
                // Делим b на a, если деление не целое, выводим результат с двумя знаками после запятой
                double r = (double) b / a;
                String formattedR = String.format("%.2f", r);
                System.out.println("b / a = " + formattedR);
            } else {
                System.out.println("b / a = " + (b / a));
            }
        } else {
            System.out.println("Деление на ноль невозможно (b / a).");
        }

        System.out.println("a * b = " + (a * b));
    }
}
