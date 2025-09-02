package dfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/84021
public class 퍼즐조각채추기 {
    static class P {
        int r, c;

        P(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }


    static int n;
    static final int[] dr = {1, -1, 0, 0};
    static final int[] dc = {0, 0, 1, -1};


    /**
     * 인접한 칸이 있으면 안된다.
     */
    class Solution {
        public int solution(int[][] game_board, int[][] table) {
            n = game_board.length;

            // game_board 0영역
            List<List<P>> holes = extractAreas(game_board, 0);
            List<List<P>> pieces = extractAreas(table, 1);

            int answer = -1;


            return answer;
        }

        // 특정 값(target)으로 이루어진 연결요소들 추출
        private List<List<P>> extractAreas(int[][] board, int target) {
            boolean[][] vis = new boolean[n][n];
            List<List<P>> areas = new ArrayList<>();

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    if (!vis[r][c] && board[r][c] == target) {
                        areas.add(bfs(board, r, c, target, vis));
                    }
                }
            }
            return areas;
        }


        private List<P> bfs(int[][] board, int sr, int sc, int target, boolean[][] vis) {
            Queue<P> q = new ArrayDeque<>();
            List<P> cells = new ArrayList<>();
            vis[sr][sc] = true;
            q.add(new P(sr, sc));

            while (!q.isEmpty()) {
                P cur = q.poll();
                cells.add(cur);
                for (int k = 0; k < 4; k++) {
                    int nr = cur.r + dr[k], nc = cur.c + dc[k];
                    if (nr < 0 || nc < 0 || nr >= n || nc >= n) continue;
                    if (vis[nr][nc]) continue;
                    if (board[nr][nc] != target) continue;
                    vis[nr][nc] = true;
                    q.add(new P(nr, nc));
                }
            }
            return cells;
        }

        private String buildKey(List<P> shape, int rot) {

            // 1) (r,c) -> (x,y)로 복사
            int len = shape.size();
            int[] xs = new int[len];
            int[] ys = new int[len];

            for (int i = 0; i < len; i++) {
                xs[i] = shape.get(i).r;
                ys[i] = shape.get(i).c;
            }

            // (x,y) ->
            // rot=0: (x,y);
            // rot=1: (y,-x);
            // rot=2 (-x,-y);
            // rot=3: (-y,x);
            int[] rx = new int[len];
            int[] ry = new int[len];
            for (int i = 0; i < len; i++) {
                int x = xs[i], y = ys[i];
                switch (rot) {
                    case 0 -> {
                        rx[i] = x;
                        ry[i] = y;
                    }
                    case 1 -> {
                        rx[i] = y;
                        ry[i] = -x;
                    }
                    case 2 -> {
                        rx[i] = -x;
                        ry[i] = -y;
                    }
                    case 3 -> {
                        rx[i] = -y;
                        ry[i] = x;
                    }
                }
            }

            // 3) 정규화: 좌상단이 (0,0) 되도록 평행이동
            int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
            for (int i = 0; i < len; i++) {
                if (rx[i] < minX) minX = rx[i];
                if (ry[i] < minY) minY = ry[i];
            }
            for (int i = 0; i < len; i++) {
                rx[i] -= minX;
                ry[i] -= minY;
            }

            // 4) 정렬 후 키 문자열 생성
            Integer[] idx = new Integer[len];
            for (int i = 0; i < len; i++) idx[i] = i;
            Arrays.sort(idx, (a, b) -> {
                if (rx[a] != rx[b]) return Integer.compare(rx[a], rx[b]);
                return Integer.compare(ry[a], ry[b]);
            });

            StringBuilder sb = new StringBuilder();
            for (int i : idx) {
                sb.append(rx[i]).append(':').append(ry[i]).append('|');
            }
            return sb.toString();
        }

    }

}
