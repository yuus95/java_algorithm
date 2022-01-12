package b1919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    static void answer() {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        int[] firstAlphabet = new int[26];
        int[] secondAlphabet = new int[26];


        for (int i = 0; i < first.length(); i++) {
            firstAlphabet[first.charAt(i) - 'a']++;
        }

        for (int i = 0; i < first.length(); i++) {
            secondAlphabet[second.charAt(i) - 'a']++;
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += (Math.abs(firstAlphabet[i] - secondAlphabet[i]));
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        answer();
    }
}
