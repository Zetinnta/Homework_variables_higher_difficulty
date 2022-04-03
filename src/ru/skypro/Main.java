package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача 6

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        int invertedResult = -result;
        System.out.println("Инвентированный результат выражения: " + invertedResult);

        //Задача 7

        a = 5;
        b = 7;
        a = a + b;
        b = - b;
        b = a + b;
        a = a - b;
        System.out.println("Теперь переменные a и b соответственно составляют " + a + " и " + b + ".");

        //Задача 8

        a = 256;
        b = a % 100;
        System.out.println("Переменная b равна " + b);
        b = b / 10;
        System.out.println("Переменная b равна " + b);

    }
}
