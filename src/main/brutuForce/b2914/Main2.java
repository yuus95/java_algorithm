package main.brutuForce.b2914;

import java.util.Scanner;

public class Main2 {
    public int solve(String input) {
        int result = 0;
        boolean isJ = false;
        int count = 0;
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (count > 0) {
                count -= 1;
                continue;
            }

            if (('l' == chars[i] || 'n' == chars[i]) && i < chars.length - 1 && 'j' == chars[i + 1]) {
                result += 1;
                count += 1;
                continue;
            }


            if (i + 2 < chars.length && 'd' == chars[i] && 'z' == chars[i + 1] && '=' == chars[i + 2]) {
                result += 1;
                count += 2;
                continue;
            }

            if (('c' == chars[i] || 'd' == chars[i]) && i + 1 < chars.length && '-' == chars[i + 1]) {
                result += 1;
                count += 1;
                continue;
            }

            if (('s' == chars[i] || 'z' == chars[i] || 'c' == chars[i]) && i + 1 < chars.length && '=' == chars[i + 1]) {
                result += 1;
                count += 1;
                continue;
            }


            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(main2.solve(input));
    }
}
