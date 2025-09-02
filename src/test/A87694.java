import java.util.LinkedList;
import java.util.Queue;

public class A87694 {

    class Solution {
        static final int MAX = 101;
        static int[][] board = new int[MAX][MAX];
        static boolean[][] visited = new boolean[MAX][MAX];
        static int[] dx = {1, -1, 0, 0};
        static int[] dy = {0, 0, -1, 1};

        public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
            for (int[] rect : rectangle) {
                int x1 = rect[0] * 2;
                int y1 = rect[1] * 2;
                int x2 = rect[2] * 2;
                int y2 = rect[3] * 2;

                for (int i = x1; i <= x2; i++) {
                    for (int j = y1; j <= y2; j++) {
                        if (i == x1 || i == x2 || j == y1 || j == y2) {
                            if (board[i][j] != 2) {
                                board[i][j] = 1;
                            }
                        } else {
                            // 내부
                            board[i][j] = 2;
                        }
                    }
                }


                Queue<int[]> q = new LinkedList<>();
                q.add(new int[]{characterX * 2, characterY * 2, 0});
                visited[characterX][characterY] = true;

                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int x = cur[0], y = cur[1], d = cur[2];
                    if (x == itemX * 2 && y == itemY * 2) {
                        return d / 2;
                    }

                    for (int dir = 0; dir < 4; dir++) {
                        int nx = x + dx[dir], ny = y + dy[dir];
                        if (nx < 0 || nx >= MAX || ny < 0 || ny >= MAX) {
                            continue;
                        }
                        if (board[nx][ny] == 1 && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            q.add(new int[]{nx, ny, d += 1});
                        }
                    }
                }
            }
            return -1;
        }
    }
}
