package src.ru.itmo.java.basics.lesson1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("Хорошо");
        System.out.println("Знаю");
        System.out.println("Java.");
        sum1();
        sum2();
        sum3();
        sum4();
        vvod();
        myScan();
    }

    public static void sum1() {
        int a = 46;
        double b = 10.0;
        double c = 3.0;
        double result = (a + b) * (b / c);
        System.out.println(result);
    }

    public static void sum2() {
        int d = 29;
        int e = 4;
        int f = -15;
        int i = (d * e * f);
        System.out.println(i);
    }

    public static void sum3() {
        double number = 10500;
        double result = (number / 10) / 10;
        System.out.println(result);
    }

    public static void sum4() {
        double g = 3.6;
        double h = 4.1;
        double j = 5.9;
        double result = (g * h * j);
        System.out.println(result);
    }

    public static void vvod() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    public static void myScan() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите целое число");
        int b = scan.nextInt();
        int x = 100;
        if (b % 2 != 0)
            System.out.println("Нечетное");
        if (b % 2 == 0 && b <= x)
            System.out.println("Четное");
        if (b % 2 == 0 && b > x)
            System.out.println("Выход за пределы диапазона");
    }

}








