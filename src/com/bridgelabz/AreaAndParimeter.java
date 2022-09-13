package com.bridgelabz;

import java.util.Scanner;

public class AreaAndParimeter {
    public static void main(String[] args) {
        AreaAndParimeter ap1 = new AreaAndParimeter();
        int choice = 0;
        while (choice != 5) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Area and Parimeter of Rectangle");
            System.out.println("2. Area and Parimeter of Circle");
            System.out.println("3. Area and parimeter of Triangle");
            System.out.println("5. Exit");
            System.out.println("Please enter above any option : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ap1.Rectangle();
                    break;
                case 2:
                    ap1.Circle();
                    break;
                case 3:
                    ap1.Triangle();
                    break;
            }
        }
    }

    public void Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter breath of Rectangle : ");
        int breadth = sc.nextInt();

        int area, parimeter;
        area = length * breadth;
        System.out.println("Area of Rectangle is : " + area);
        parimeter = 2 * (length + breadth);
        System.out.println("Parimeter of Rectangle is : " + parimeter);
    }

    public void Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter redius : ");
        int r = sc.nextInt();
        double pi = 3.14, area, parimeter;
        area = pi * r * r;
        parimeter = 2 * pi * r;
        System.out.println("Area of Circle : " + area);
        System.out.println("Parimeter of Circle : " + parimeter);
    }

    public void Triangle() {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st side of Triangle : ");
        a = sc.nextInt();
        System.out.println("Enter 2nd side of Triangle : ");
        b = sc.nextInt();
        System.out.println("Enter 3rd side of Triangle : ");
        c = sc.nextInt();
        float h,area,parimeter;
        System.out.println("Enter hight of Triangle : ");
        h = sc.nextFloat();
        area = b * h / 2;
        parimeter = a + b + c;
        System.out.println("Area of Traingle is : " + area);
        System.out.println("Parimeter of Triangle : " + parimeter);

    }
}

