package org.example.Homework_Algoritms;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // базовый случай
            return 1;
        } else { // рекурсивный случай
            return n * factorial(n-1);
        }
    }

}

