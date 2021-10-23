package kakao_2020_intern;

import java.util.Arrays;
import java.util.Stack;

public class Pro81303 {
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        System.out.println(solution(8, 2, new String[]{"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"}));
    }

    //n 명령어 갯수, c 처음 커서위치
    public static String solution(int n, int c, String[] cmd) {
        boolean[] ans = new boolean[n];
        int[] preArray = new int[n];
        int[] nextArray = new int[n];

        for (int i = 0; i < n; i++) {
            preArray[i] = i - 1;
            nextArray[i] = i + 1;
        }

        StringBuilder sb = new StringBuilder();

        for (String s : cmd) {
            if (s.length() == 1) {
                if (s.equals("C")) {
                    stack.add(c);
                    System.out.println(c);
                    if (preArray[c] != -1) {
                        nextArray[preArray[c]] = nextArray[c];
                    }
                    if (nextArray[c] != n) {
                        preArray[nextArray[c]] = preArray[c];
                    }
                    ans[c] = true;
                    if (nextArray[c] == n) {
                        c = preArray[c];
                    } else {
                        c = nextArray[c];
                    }
                } else {
                    Integer pop = stack.pop();
                    if (nextArray[pop] != n) {
                        preArray[nextArray[pop]] = pop;
                    }
                    if (preArray[pop] != -1) {
                        nextArray[preArray[pop]] = pop;
                    }
                    ans[pop] = false;
                }
            } else {
                String[] s1 = s.split(" ");
                if (s1[0].equals("U")) {
                    for (int i = 0; i < Integer.parseInt(s1[1]); i++) {
                        c = preArray[c];
                    }
                } else {
                    for (int i = 0; i < Integer.parseInt(s1[1]); i++) {
                        c = nextArray[c];
                    }
                }

            }
        }
        for(int i=0; i<n; i++){
            if (ans[i]){
                sb.append("X");
            }else{
                sb.append("O");
            }
        }
        System.out.println(Arrays.toString(ans));
        String answer = sb.toString();
        return answer;
    }
}