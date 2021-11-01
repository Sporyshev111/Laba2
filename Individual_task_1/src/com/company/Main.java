package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите точку X: ");
        double x = scanner.nextDouble();
        System.out.println("Введите точку Y: ");
        double y = scanner.nextDouble();
        if (x > 0 && y > 0)
        {
            System.out.println("Четверть точки ("+x+";"+y+") = 1");
        }
        else {
            if (x < 0 && y > 0) {
                System.out.println("Четверть точки (" + x + ";" + y + ") = 2");
            } else {

                if (x < 0 && y < 0) {
                    System.out.println("Четверть точки (" + x + ";" + y + ") = 3");
                } else {
                    if (x > 0 && y < 0)
                    {
                        System.out.println("Четверть точки (" + x + ";" + y + ") = 4");
                    }  else{
                        System.out.println("0");
                    }

                }
            }
        }




        scanner.close();
    }
}
