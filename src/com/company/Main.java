package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String s = scanner.nextLine();
        int x = Integer.parseInt(s,2);
        System.out.println("Число в десятичном формате:");
        System.out.println(x);
    }
}
