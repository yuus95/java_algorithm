package y20221126.b24416;

import java.util.Scanner;

public class Main {
    static int fibCnt = 0;
    static int fibonacciCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        Main main = new Main();
        main.fib(result);
        int v2 = main.fibV2(result);
        System.out.println(fibCnt + " " + v2);

    }

    public int fib(int n) {
        if (n == 1 || n == 2) {
            fibCnt += 1;
            return 1;
        }
        return (fib(n - 1) + fib(n - 2));
    }

    public int fibV2(int n){
        if( n<= 2 ){
            return 1;
        }
        return n-2;
    }

}
