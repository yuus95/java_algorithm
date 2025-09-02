import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Comprator.comparing -> T 에서 sort 키를 추출한다.
 * Comparator T의 정렬 방법을 정의한다.
 */
public class ComparingTest {

    class Solution {

        public String solution(String s) {
            Map<Character, Long> characterLongMap
                    = s.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            return s.chars()
                    .mapToObj(c -> (char) c)
                    .sorted((c1, c2) -> {
                        int freqCompare = characterLongMap.get(c2).compareTo(characterLongMap.get(c1));
                        if (freqCompare == 0) {
                            return Character.compare(c1, c2);
                        }
                        return freqCompare;
                    }).map(String::valueOf)
                    .collect(Collectors.joining());
        }
    }

    @DisplayName("")
    @Test
    void name() {
        /**
         * {1,2}, {1,3}, {1,4}
         */
        int[][] temp = new int[][]{
                {1, 2},
                {1, 4},
                {1, 5},
                {1, 3}
        };

        List<int[]> list = Arrays.stream(temp)
                .sorted(Comparator.comparing((int[] a) -> a[1]).reversed())
                .toList();

        System.out.println();
    }

    @DisplayName("")
    @Test
    void adds() {
        String solution = new Solution().solution("bacc");
        Assertions.assertEquals(solution, "ccab");
    }
}
