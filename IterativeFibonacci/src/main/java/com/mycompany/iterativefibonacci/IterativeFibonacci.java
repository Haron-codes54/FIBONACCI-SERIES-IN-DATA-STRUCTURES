package com.mycompany.iterativefibonacci;


import java.util.Scanner;

public class IterativeFibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the maximum position n: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println(
                "Enter a non-negative number."
            );
            input.close();
            return;
        }

        long[] fib = new long[n + 1];

        fib[0] = 0;

        if (n >= 1) {
            fib[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci series:");

        for (int i = 0; i <= n; i++) {
            System.out.print(fib[i] + " ");
        }

        System.out.println();
        input.close();
    }
}