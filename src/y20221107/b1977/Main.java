package y20221107.b1977;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int min = 10001;

        int[] squareNumber = new int[101];

        for (int i = 1; i <= 100; i++) {
            squareNumber[i] = i * i;
            if (squareNumber[i] >= m && squareNumber[i] <= n) {
                sum += squareNumber[i];
                if(squareNumber[i] < min ){
                    min = squareNumber[i];
                }
            }
        }
        print(sum,min);
    }

    private static void print(int sum, int min) {
        if( sum == 0 ){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
