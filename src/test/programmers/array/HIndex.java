package programmers.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HIndex {


    @DisplayName("")
    @Test
    void name() {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{3, 0, 6, 1, 5});
        System.out.println(result);
    }

    class Solution {
        public int solution(int[] citations) {
            Arrays.sort(citations);
            int number = 0;

            for (int i = 0; i < citations.length - 1; i++) {
                int modNumber = citations.length - i;
                if (citations[i] <= modNumber) {
                    number = citations[i];
                }
            }

            return number;
        }
    }
}
