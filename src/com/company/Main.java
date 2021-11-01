package com.company;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static double MySin(double x){

        double sumNeu, sumOld, sum;
        int i = 1;
        sum = sumNeu = x;
        do
        {
            sumOld = sumNeu;
            i++; sum = + sum * x * x / i;
            i++; sum = sum / i;
            sum = -sum;
            sumNeu = sumOld + sum;
        }
        while(sumNeu != sumOld);

        return sumNeu;
    }

    public static void main(String[] args) {
        System.out.println("Введите номер задания:  ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        switch (number) {
            case(1):
                System.out.println("_______Задание №1_______");

            {

                Scanner in = new Scanner(System.in);
                double a, b, c;
                double D;
                System.out.println("Программа решает квадратное уравнение вида:");
                System.out.println("ax^2 + bx + c = 0");

                System.out.println("Введите a: ");
                a = in.nextDouble();
                System.out.println("Введите b: ");
                b = in.nextDouble();
                System.out.println("Введите c: ");
                c = in.nextDouble();
                scanner.close();
                if (a !=0 && b !=0 && c != 0) {


                    D = b * b - 4 * a * c;
                    if (D > 0) {
                        double x1, x2;
                        x1 = (-b - Math.sqrt(D)) / (2 * a);
                        x2 = (-b + Math.sqrt(D)) / (2 * a);
                        System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
                    } else if (D == 0) {
                        double x;
                        x = -b / (2 * a);
                        System.out.println("Уравнение имеет единственный корень: x = " + x);
                    } else {
                        System.out.println("Уравнение не имеет действительных корней!");
                    }
                }
                else {
                    System.out.println("a, b и c должны быть отличные от 0!");
                }
            in.close();
            break;
            }
            case (2):
            {
                System.out.println("_______Задание №2_______");
                Scanner in = new Scanner(System.in);
                boolean gonext = true;

                while (gonext) {
                    System.out.println("Введите колечество слагаемых: ");
                    int count = in.nextInt();
                    double pi = 0;
                    double oddNum = 1;
                    for (int i = 0; i < count; i++) {
                        if (i % 2 == 0) {
                            pi += (1 / oddNum);
                        } else {
                            pi -= (1 / oddNum);
                        }
                        oddNum += 2;
                    }
                    pi = pi * 4;
                    double pogreshnost = Math.PI - pi;
                    System.out.println("Полученное число: " + pi);
                    System.out.println("Погрешность вычисления: " + Math.abs(pogreshnost));
                    System.out.println("Хотие посчитать еще раз? да/нет");
                    String yesornot = in.next();

                    switch (yesornot){
                        case ("да"):
                        {
                            gonext = true;
                            break;
                        }
                        case ("нет"):
                        {
                            gonext = false;
                            break;
                        }
                        default:
                        {
                            System.out.println("Вы ввели недопустимое выражение!");
                            gonext = false;
                        }

                    }
                }
                scanner.close();


                break;
            }
            case (3):
            {  System.out.println("_______Задание №3_______");
                System.out.println("ряд Фибоначчи, введите число элементов: ");
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                in.close();
                int num = 0;
                int n0 = 1, n1 = 1, n2;
                System.out.print(n0+" "+n1+" ");

                for(int i = 0; i < n-2; i++){
                    n2=n0+n1;
                    double n_2 = n2/1000;
                    if(n_2>=1 && n_2<10)
                    {
                    num++;
                    }

                    System.out.print(n2+" ");
                    n0=n1;
                    n1=n2;
                }
                System.out.println("");
                System.out.println("Количество четырехзначных чисел: "+num);

                break;

            }

            case(4):{
                System.out.println("_______Задание №4_______");
                Scanner in = new Scanner(System.in);
                double x, s, c, q;
                int i, fk, z;
                System.out.println("Введите x: ");
                x = in.nextDouble();
                System.out.println("Введите  q: ");
                q = in.nextDouble();
                s = x * x;
                fk = 2;
                c = 1;
                i = 2;
                z = -1;
                while (s / fk >= q)
                {
                    c = c + z * s / fk;
                    i += 2;
                    s = s * x * x;
                    fk = fk * (i - 1) * i;
                    z = z * (-1);
                }
                i = i / 2 + 1;
                x = Math.cos(x);
                System.out.println("Количество слагаемых = " + i);
                System.out.println("Значение cos(x) = " + c);
                System.out.println("Значение x = " +x ) ;
                break;
            }
            case (5):
            {
                 System.out.println("_______Задание №5_______");
                Scanner in = new Scanner(System.in);
                System.out.println("Введите число:");
                int n = in.nextInt();
                boolean yes = false;

                for (int i = 10; i < 1000; i++)
                {

                    double x3, y3, z3;
                    int x = i % 10;
                    int y = (i % 100) / 10;
                    int z = i / 100;
                    if (i > 99)
                    {
                        x3 = Math.pow(x, 3);
                        y3 = Math.pow(y, 3);
                        z3 = Math.pow(z, 3);
                        if (x3 + y3 + z3 == n)
                        {

                            yes = true;
                            System.out.println(x+"^3 + "+y+"^3 + "+z+"^3 = "+n);


                        }

                    }

                }
                if(yes == false)
                {
                    System.out.println("Нет таких комбинаций!");
                }
                break;
            }
            case (6):
            {
                System.out.println("_______Задание №6_______");
                System.out.println("Введите год вашего рождения: ");
                Scanner in = new Scanner(System.in);

                int yearOfBirth = in.nextInt();
                if (yearOfBirth>= 1921 && yearOfBirth <= 2021  ) {


                    int yearsOld = (new Date()).getYear() + 1900 - yearOfBirth;
                    int lastDigit = yearsOld % 10;
                    int previousLastDigit = yearsOld / 10 % 10;

                    if (previousLastDigit == 1) {
                        System.out.print(yearsOld + " лет");
                    } else {
                        switch (lastDigit) {
                            case 1:
                                System.out.print("Вам " + yearsOld + " год");
                                break;
                            case 2:
                            case 3:
                            case 4:
                                System.out.print("Вам " + yearsOld + " года");
                                break;
                            default:
                                System.out.print("Вам " + yearsOld + " лет");
                        }
                    }
                }
                else {
                    System.out.println("Вы обманщик");
                }

                scanner.close();
break;
            }
        }

        }
    }

