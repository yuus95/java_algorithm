package main.y20221114.b1213;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        AtomicReference<String> modString = new AtomicReference<>("");
        Map<String, Integer> result = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] split = str.split("");

        Arrays.stream(split).forEach(s -> {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
                sb.append(s);
            }
        });

        AtomicInteger cnt = new AtomicInteger();

        result.forEach((temp, a) -> {
            if (a % 2 == 1) {
                cnt.addAndGet(1);
                modString.set(temp);
            }
        });

        int oddNumber = cnt.get();

        if (oddNumber > 1) {
            System.out.println("I'm Sorry Hansoo");
            System.exit(0);
        }

        String modStringResult = "";

        if (oddNumber == 1) {
            modStringResult = modString.get();
        }

        result.forEach((temp, a) -> result.put(temp, result.get(temp) / 2));

        char[] problem = sb.toString().toCharArray();
        Arrays.sort(problem);

        StringBuilder resultSb = new StringBuilder();
        for (char c : problem) {
            String cToString = String.valueOf(c);
            Integer problemSize = result.get(cToString);
            resultSb.append(cToString.repeat(Math.max(0, problemSize)));
        }
        System.out.println(resultSb.toString()+ modStringResult + resultSb.reverse().toString());
    }
}
