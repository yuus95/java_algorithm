package programmers.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxNumber {

    class Solution {
        public String solution(int[] numbers) {
            String[] numStrs = Arrays.stream(numbers)
                    .mapToObj(String::valueOf)
                    .toArray(String[]::new);

            Arrays.sort(numStrs, (o1, o2) -> (o2+ o1).compareTo(o1 + o2));
            if (numStrs[0].equals("0")) {
                return "0";
            }

            StringBuilder sb = new StringBuilder();
            for (String numStr : numStrs) {
                sb.append(numStr);
            }

            return sb.toString();
        }
    }


    @DisplayName("")
    @Test
    void name() {
        String solution = new Solution().solution(new int[]{6, 10, 2});
        System.out.println(solution);
    }
}
