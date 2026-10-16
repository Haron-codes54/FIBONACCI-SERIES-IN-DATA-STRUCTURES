package com.mycompany.fibonacciperformance;

import java.util.Arrays;

public class FibonacciPerformance {

    static long recursiveFib(int n) {
        if (n <= 1) {
            return n;
        }

        return recursiveFib(n - 1)
             + recursiveFib(n - 2);
    }

    static long iterativeFib(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    static long dynamicFib(int n) {
        if (n <= 1) {
            return n;
        }

        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);

        memo[0] = 0;
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
    }

    public static void main(String[] args) {
        int n = 30;
        long result;

        // Recursive benchmark
        long start = System.nanoTime();
        result = recursiveFib(n);
        long recursiveTime = System.nanoTime() - start;

        System.out.println("Recursive result: " + result);

        // Iterative benchmark
        start = System.nanoTime();
        result = iterativeFib(n);
        long iterativeTime = System.nanoTime() - start;

        System.out.println("Iterative result: " + result);

        // Dynamic programming benchmark
        start = System.nanoTime();
        result = dynamicFib(n);
        long dynamicTime = System.nanoTime() - start;

        System.out.println("Dynamic result: " + result);

        System.out.println("\nExecution times:");
        System.out.println(
            "Recursive: " + recursiveTime + " ns"
        );
        System.out.println(
            "Iterative: " + iterativeTime + " ns"
        );
        System.out.println(
            "Dynamic: " + dynamicTime + " ns"
        );
    }
}