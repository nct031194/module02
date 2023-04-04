package com.codegym;

import java.util.Scanner;

public class Reactangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("chieu dai hcn : ");
        width = scanner.nextFloat();

        System.out.println("chieu rong hcn: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("dien tich hcn : " + area);

    }
}
