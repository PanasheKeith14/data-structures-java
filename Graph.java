package graph;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int src, int dest) {
        adjList.computeIfAbsent(src, k -> new ArrayList<>()).add(dest);
        adjList.computeIfAbsent(dest, k -> new ArrayList<>()).add(src);
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsRec(start, visited);
        System.out.println();
    }

    private void dfsRec(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsRec(neighbor, visited);
            }
        }
    }
}