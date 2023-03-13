package main.brutuForce.b2753;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        if (inp % 400 == 0 || (inp % 4 == 0 && inp % 100 != 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
