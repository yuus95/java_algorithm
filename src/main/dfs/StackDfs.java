package dfs;

import java.util.ArrayList;
import java.util.Stack;

public class StackDfs {

    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    public static void dfs(int v) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[v] = true;

        while (!stack.isEmpty()) {
            int u = stack.pop();
            System.out.println(u);

            for (int next : adj[u]) {
                if (!visited[next]) {
                    stack.push(next);
                    visited[next] = true;
                }
            }
        }
    }

}
