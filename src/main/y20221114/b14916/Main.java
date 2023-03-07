package main.y20221114.b14916;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int result = m;
        int maxFive = m / 5;
        if (m % 5 == 0) {
            System.out.println(maxFive);
            System.exit(0);
        }

        for (int i = maxFive; i >= 0; i--) {
            int tempDivideByFive = m - i * 5;
            if (tempDivideByFive % 2 == 1) {
                continue;
            }
            int tempResult = tempDivideByFive / 2 + i;
            if (result > tempResult) {
                result = tempResult;
            }
        }
        if (result == m) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(result);
    }
}
