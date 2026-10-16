package com.mycompany.recursivefibonacci;
import java.util.Scanner;
public class RecursiveFibonacci {
    static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1)
             + fibonacci(n - 2);
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