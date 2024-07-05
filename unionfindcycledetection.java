package javaassignments20;
import java.util.*;
public class unionfindcycledetection {
	private int[] parent;
    private int[] rank;

    public unionfindcycledetection(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }
    public int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]); // Path compression
        }
        return parent[node];
    }

    public void union(int node1, int node2) {
        int root1 = find(node1);
        int root2 = find(node2);

        if (root1 != root2) {
            // Union by rank
            if (rank[root1] > rank[root2]) {
                parent[root2] = root1;
            } else if (rank[root1] < rank[root2]) {
                parent[root1] = root2;
            } else {
                parent[root2] = root1;
                rank[root1]++;
            }
        }
    }

    public static boolean hasCycle(int[][] edges, int numVertices) {
        unionfindcycledetection uf = new unionfindcycledetection(numVertices);

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];

            if (uf.find(node1) == uf.find(node2)) {
                return true; // Cycle detected
            }
            uf.union(node1, node2);
        }

        return false; // No cycle detected
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int numVertices = 4;
	        int[][] edges = {
	            {0, 1},
	            {1, 2},
	            {2, 3},
	            {3, 0}
	        };

	        if (hasCycle(edges, numVertices)) {
	            System.out.println("Graph contains a cycle");
	        } else {
	            System.out.println("Graph doesn't contain a cycle");
	        }

	}

}
