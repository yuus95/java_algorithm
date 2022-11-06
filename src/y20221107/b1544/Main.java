package y20221107.b1544;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        AtomicInteger result = new AtomicInteger(1);
        List<String> words = new ArrayList<>();
        List<String> results = new ArrayList<>();
        for( int i = 0 ; i <  m; i++){
            words.add(sc.next());
        }
        words.forEach(word ->{
            results.add(word);
            boolean tempResult = false;
            for(int i = 0; i < word.length(); i++){
                String temp = word.substring(i) + word.substring(0,i);
                if(results.contains(temp)){
                    tempResult = true;
                }
            }
            if(!tempResult){
                result.addAndGet(1);
            }
        });
        System.out.println(result);
    }
}

// abc

