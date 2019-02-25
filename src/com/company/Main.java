package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            //first();
            //second();
            //third();
            //fourth();
            //fifth();
            //sixth();
            //seventh();
            //eighth();
            //ninth();
            //tenth();
        }

    private static void tenth() {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        double res;
        System.out.println("Введите значения a и b");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        double x,x1,x2,x3;
        if(a!=0 && b !=0){
            x1 = 0;
            x2 = Math.sqrt((b/a));
            x3 = (-1*Math.sqrt((b/a)));
            System.out.println("X1 = " + x1 + "\t" + "X2 = " + x2 + "\t" + "X3 = " + x3);
            }
        else {
            x = 0;
            System.out.println("X = " + x);
        }
    }
    
    private static void ninth() {
        double x = 523.234,y = 224.342;
        double sum;
        double op;
        sum = (x+y)/2;
        System.out.println("Половина суммы " + sum);
        op = x*y;
        System.out.println("Произведение " + op);
        if(x > y) {
            x = sum;
            y = op;
        }
        else{
            x = op;
            y = sum;
        }

        System.out.println("X =" + x + "\t" + "Y = " + y);
    }
    
    private static void eighth() {
        int number = 100;
        int sum;
        int q;
        int hundreds = 0, decimals = 0, ones = 0;
        ones = number%10;
        decimals = number/10%10;
        hundreds = number/100%10;
        sum = (int) Math.pow(ones,3) + (int) Math.pow(decimals,3) + (int) Math.pow(hundreds,3);
        q=(int) Math.pow(number,3);
        System.out.println((sum==q) ? "Равны" : "Не равны");
    }
    
    private static void seventh() {
        int number = (int)(Math.random()*1000);
        System.out.println(number);
        int hundreds = 0, decimals = 0, ones = 0;
        ones = number%10;
        decimals = number/10%10;
        hundreds = number/100%10;
        System.out.println(ones > hundreds ? "Последняя цифра больше первой" : (ones < hundreds ? "Первая цифра больше последней" : "Первая цифра равна последней"));
        System.out.println(decimals > hundreds ? "Вторая цифра больше первой" : (decimals < hundreds ? "Первая цифра больше второй" : "Первая цифра равна второй"));
        System.out.println(ones < decimals ? "Вторая цифра больше последней" : (ones > decimals ? "Последняя цифра больше второй" : "Последняя цифра равна второй"));
        System.out.println();
    }
    
    private static void sixth() {
        Scanner scanner = new Scanner(System.in);
        int dur,num;
        System.out.println("\nДлитетельность вызова(целое количество минут) ");
        dur = scanner.nextInt();
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");
        num = scanner.nextInt();
        double dis;
        switch(num)
        {
            case 1:
                System.out.println("Понедельник" +"\n"+"Скидка не начислена"); break;

            case 2:
                System.out.println("Вторник" +"\n"+"Скидка не начислена"); break;

            case 3:
                System.out.println("Среда" +"\n"+"Скидка не начислена"); break;

            case 4:
                System.out.println("Четверг" +"\n"+"Скидка не начислена"); break;

            case 5:
                System.out.println("Пятница" +"\n"+"Скидка не начислена"); break;

            case 6:
                System.out.println("Суббота" +"\n"+ "Предоставляемая скидка 20%");

                dis = dur*0.80;
                System.out.println("Стоимость разговора " + dis);break;

            case 7:
                System.out.println("Воскресенье" +"\n"+ "Предоставляемая скидка 20%");

                dis = dur*0.80;
                System.out.println("Стоимость разговора " + dis);break;

            default:
                System.out.println("Введен несуществующий день недели");
        }
    }
    
    private static void fifth() {
        Scanner scanner = new Scanner (System.in);
        int a;
        System.out.println("Введите значение a ");
        a = scanner.nextInt();
        System.out.println(((a%3)==0) ? "Значение делится нацело на три" : "Значение не делится нацело на три");
    }
    
    private static void fourth() {
        Scanner scanner = new Scanner (System.in);
        int a;
        System.out.println("Введите значение a ");
        a = scanner.nextInt();
        System.out.println(((a%2)==0) ? "Значение четное" : "Значение не является четным");
    }
    
    private static void third() {
        Scanner scanner = new Scanner(System.in);
        int sum;
        double c = 0;
        System.out.println("Введите стоимость покупки ");
        sum = scanner.nextInt();
        if (sum > 500) {
            c = sum * 0.97;
            System.out.println("Стоимость покупки с учетом скидки 3% составляет "+ c);
        }
            if(sum > 1000) {
                c = sum * 0.95;
                System.out.println("Стоимость покупки с учетом скидки 5% составляет  "+ c);
            }
                if (sum <= 500 || sum == 0)
                    System.out.println("Введено неверное значение");



    }
    private static void second() {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("В каком году была основана Одесса");
        a = scanner.nextInt();

        if(a == 1794)
            System.out.println("Ответ верный ");
        else
            System.out.println("Вы ошиблись, Одесса была основана в 1794 году.");
    }
    
    private static void first() {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        double c;

        System.out.println("Введите значение a");
        a = scanner.nextInt();
        System.out.println("Введите значение b");
        b = scanner.nextInt();

        if(b != 0)
        {
           c = a/b;
            System.out.println("Решение = " + c);
        }
        else
        {
            System.out.println("Значение b не должно быть равным 0");
        }
    }
}
