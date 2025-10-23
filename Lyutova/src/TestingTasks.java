import java.util.Arrays;
import java.util.Scanner;

public class TestingTasks {
    
    // Задача 1: Операции с числами
    public static void compareAndCalculateNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ЗАДАЧА 1: Операции с числами ===");
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();
        
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Арифметические операции
        System.out.println("Результаты арифметических операций:");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        
        // Проверка деления на ноль
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + ((double)a / b));
        } else {
            System.out.println(a + " / " + b + " = Ошибка: деление на ноль!");
        }
        
        System.out.println();
    }
    
    // Задача 2: Сравнение строк
    public static void compareStrings() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ЗАДАЧА 2: Сравнение строк ===");
        System.out.print("Введите первую строку (a): ");
        scanner.nextLine(); // Очистка буфера
        String a = scanner.nextLine();
        
        System.out.print("Введите вторую строку (b): ");
        String b = scanner.nextLine();
        
        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        System.out.println();
    }
    
    // Задача 3: Четные числа в массиве
    public static void findEvenNumbers() {
        System.out.println("=== ЗАДАЧА 3: Четные числа в массиве ===");
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        
        System.out.print("Четные числа: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\n");
    }
    
    // Главный метод
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Программа тестировщика на Java");
        System.out.println("==============================");
        
        boolean continueRunning = true;
        
        while (continueRunning) {
            System.out.println("Выберите задачу для выполнения:");
            System.out.println("1 - Операции с числами");
            System.out.println("2 - Сравнение строк");
            System.out.println("3 - Поиск четных чисел в массиве");
            System.out.println("4 - Выполнить все задачи");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    compareAndCalculateNumbers();
                    break;
                case 2:
                    compareStrings();
                    break;
                case 3:
                    findEvenNumbers();
                    break;
                case 4:
                    compareAndCalculateNumbers();
                    compareStrings();
                    findEvenNumbers();
                    break;
                case 0:
                    continueRunning = false;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.\n");
            }
        }
        
        scanner.close();
    }
}