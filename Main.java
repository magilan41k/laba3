package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x");
        int x = in.nextInt();
        System.out.println("Введите значение a");
        int a = in.nextInt();
        System.out.println("Введите значение c");
        int c = in.nextInt();
        System.out.println("Введите значение x нач.");
        int xнач = in.nextInt();
        System.out.println("Введите значение x кон.");
        int xкон = in.nextInt();
        if (c < 0 && a != 0) {
            double fx = -a * Math.pow(x, 2);
        } else if (c > 0 && a == 0) {
            double fx = (a - x) / (c * x);
        } else {
            System.out.println(x);
        }
        in.close();
    }
}