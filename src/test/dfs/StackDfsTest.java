package dfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StackDfsTest {

    @DisplayName("")
    @Test
    void name() {
        int n = 5; // number of vertices
        StackDfs.adj = new ArrayList[n];
        StackDfs.visited = new boolean[n];

        // initialize adjacency list and visited array
        for (int i = 0; i < n; i++) {
            StackDfs.adj[i] = new ArrayList<>();
            StackDfs.visited[i] = false;
        }

        // add edges to the graph
        StackDfs.adj[0].add(1);
        StackDfs.adj[0].add(2);
        StackDfs.adj[1].add(2);
        StackDfs.adj[2].add(0);
        StackDfs.adj[2].add(3);
        StackDfs.adj[3].add(3);

        for (int i = 0; i < n; i++) {
            if (!StackDfs.visited[i]) {
                StackDfs.dfs(i);
            }
        }
    }
}
