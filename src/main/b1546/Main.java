package main.b1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            soludtion();
    }
    public static void soludtion(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        double[] scoreBox = new double[len];
        double maxNum = -1;
        for(int i = 0 ; i<len; i++){
            scoreBox[i] = sc.nextInt();
            if(maxNum < scoreBox[i]){
                maxNum = scoreBox[i];
            }
        }
        double sum = 0;
        for(int i =0; i<len;i++){
            sum+= scoreBox[i]/  maxNum *100;
        }
        System.out.println(sum/len);
    }

}
