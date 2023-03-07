package main.b1919;

import java.io.IOException;
import java.util.Scanner;

public class main {
    static void answer(){
        Scanner sc = new Scanner(System.in);
        String first =  sc.nextLine();
        String second = sc.nextLine();

        int[] firstAlphabet = new int[26];
        int[] secondAlphabet = new int[26];


        for(int i = 0; i<first.length();i++){
            firstAlphabet[first.charAt(i)-'a']++;
        }

        for(int i = 0; i<first.length();i++){
            secondAlphabet[second.charAt(i)-'a']++;
        }
        int cnt = 0;
        for (int i =0; i<26;i++){
            cnt+=(Math.abs(firstAlphabet[i]-secondAlphabet[i]));
        }
        if(cnt>=0){
            System.out.println(cnt);
        }
    }

    public static void main(String[] args) throws IOException {
        answer();
    }
}
