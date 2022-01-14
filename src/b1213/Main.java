package b1213;

import java.util.Scanner;

public class Main {
    public static void solution(){
        Scanner sc= new Scanner(System.in);
        String ip = sc.nextLine();
        int[] arr = new int[26];

        for(int i = 0; i<ip.length();i++){
            arr[ip.charAt(i)-'A']++;
        }
        boolean ok = false;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 1) {
                if (ok == false) {
                    ok = true;
                } else {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
        }
       char[] result = new char[ip.length()];
       for(int i =0; i<arr.length;i++) {

       }


    }

    public static void main(String[] args){
        solution();
    }
}
