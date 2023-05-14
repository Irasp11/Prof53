package org.example.Homework_Algoritms;

public class Recursion {
    //    На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать
    //    по ним вниз, к основанию.
//    Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
//            (То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
//    Определить число всевозможных «маршрутов» мячика с вершины на землю.
    public static int sequence(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else if (n % 2 == 0) {
            return sequence(n / 2) + sequence(n / 2 - 1);
        } else {
            return sequence(n / 2) - sequence(n / 2 - 1);
        }
    }


    public static int optimization(int n) {
        int[] seq = new int[n + 1];
        seq[0] = seq[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                seq[i] = seq[i / 2] + seq[i / 2 - 1];
            } else {
                seq[i] = seq[i / 2] - seq[i / 2 - 1];
            }
        }

        return seq[n];
    }

    //    На вершине лесенки, содержащей N ступенек, находится мячик, который начинает прыгать
    //    по ним вниз, к основанию.
//    Мячик может прыгнуть на следующую ступеньку, на ступеньку через одну или через 2.
//            (То есть, если мячик лежит на 8-ой ступеньке, то он может переместиться на 5-ую, 6-ую или 7-ую.)
//    Определить число всевозможных «маршрутов» мячика с вершины на землю.

    private static int road(int stairs, int step){
        int count = 0;
        if(stairs<0||step<0)
            return 0;
        if(stairs==0)
            return 1;
        for (int i = 1; i <= step; i++) {
            count+=road(stairs-i, step);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sequence(6));
        System.out.println(optimization(6));
        System.out.println(road(8, 3));
    }
}