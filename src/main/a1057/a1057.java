package main.a1057;


import java.util.Scanner;

public class a1057 {
    public static  void main(String args[]){
//        1. Scanner sc = new Scanner(WhitePrincess.class.getResourceAsStream("sample.txt")); // 현재 폴더에서 파일 검색
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Kim = scan.nextInt();
        int Lim = scan.nextInt();
        int count = 0 ;

        while(Kim != Lim){
            Kim = (Kim+1) /2 ;
            Lim = (Lim+1)/2;
            count ++;
        }
        System.out.println(count);
        scan.close();
    }
}
