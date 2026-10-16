package com.mycompany.dynamicfibonacci;

import java.util.Scanner;

public class DynamicFibonacci {

    static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Position must be non-negative."
            );
        }

        long[] fib = new long[n + 1];

        if (n >= 1) {
            fib[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the position n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println(
                "Enter a non-negative number."
            );
        } else {
            System.out.println(
                "Fibonacci number at position "
                + n + " is " + fibonacci(n)
            );
        }

        input.close();
    }
}