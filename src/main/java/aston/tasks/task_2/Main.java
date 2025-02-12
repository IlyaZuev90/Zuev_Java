package aston.tasks.task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Считываем первую строку
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();

        // Считываем вторую строку
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        // Сравниваем строки и выводим результат
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        // Закрываем сканер
        scanner.close();
    }
}
