package main.y20221126.b16395;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] box = new int[31][31];
        box[1][1] = 1;
        box[2][1] = 1;
        box[2][2] = 1;

        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int location = Integer.parseInt(s[1]);
        if (n <= 2) {
            System.out.println(box[n][location]);
        }
        else{
            for (int i = 3; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        box[i][j] = 1;
                    }else{
                        box[i][j] = box[i - 1][j - 1] + box[i - 1][j];
                    }
                }
            }
            System.out.println(box[n][location]);
        }
    }
}
