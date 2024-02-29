package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        scanner.nextLine(); // Очистка буфера

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Деление: " + (b != 0 ? (double) a / b : "Деление на 0 невозможно"));
        System.out.println("Умножение: " + (a * b));

        // Задание 2
        System.out.print("Введите первую строку: ");
        String firstLine = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String secondLine = scanner.nextLine();

        System.out.println(firstLine.equals(secondLine) ? "Строки идентичны" : "Строки неидентичны");

        scanner.close();

        // Задание 3
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Все чётные числа из массива: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}