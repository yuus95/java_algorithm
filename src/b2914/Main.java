package b2914;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        if (inp.length() == 0) {
            System.out.println(0);
        }
        char[] inpArray = inp.toCharArray();
        int cnt = 0;
        List<String> stringList = new ArrayList<String>(Arrays.asList("c=","c-","dz=","d-","lj","nj","s=","z="));

        int start = 0;
        int idx = 1;
        for(int i = 0; i<inp.length()-1;i++){
            char temp = inp.charAt(i);
            System.out.println( "----${temp}--- " + inp.charAt(i));

            for(int j=1; j<3;j++){
                if(i+j<inp.length()){
                    System.out.println(temp);
                    if (stringList.contains(temp)){
                        System.out.println("---${temp}---");
                    }
                }
            }
        }


    }
}
