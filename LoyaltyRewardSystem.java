package com.mycompany.loyaltyrewardsystem;

import java.util.Scanner;

public class LoyaltyRewardSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
            "CUSTOMER LOYALTY REWARD SYSTEM"
        );

        System.out.print(
            "Enter the number of loyal years: "
        );

        int years = input.nextInt();

        if (years <= 0) {
            System.out.println(
                "Please enter a positive number of years."
            );
            input.close();
            return;
        }

        long[] rewards = new long[years];

        rewards[0] = 0;

        if (years >= 2) {
            rewards[1] = 1;
        }

        for (int i = 2; i < years; i++) {
            rewards[i] =
                rewards[i - 1] + rewards[i - 2];
        }

        System.out.println();
        System.out.printf("%-10s %s%n",
                          "Year", "Reward Points");
        System.out.println("------------------------");

        for (int i = 0; i < years; i++) {
            System.out.printf("%-10d %d%n",
                              i + 1, rewards[i]);
        }

        input.close();
    }
}