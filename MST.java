package javaassignments20;
import java.util.*;

class Edge implements Comparable<Edge> {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge otherEdge) {
        return this.weight - otherEdge.weight;
    }
}

class Subset {
    int parent, rank;
}

public class MST {
    private int vertices;
    private List<Edge> edges;

    public MST(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    public int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    public void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    public void kruskalMST() {
        List<Edge> result = new ArrayList<>();
        Collections.sort(edges);

        Subset[] subsets = new Subset[vertices];
        for (int i = 0; i < vertices; ++i)
            subsets[i] = new Subset();

        for (int v = 0; v < vertices; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        int e = 0;
        int i = 0;

        while (e < vertices - 1) {
            Edge nextEdge = edges.get(i++);
            int x = find(subsets, nextEdge.source);
            int y = find(subsets, nextEdge.destination);

            if (x != y) {
                result.add(nextEdge);
                union(subsets, x, y);
                e++;
            }
        }

        System.out.println("Following are the edges in the constructed MST:");
        int minimumCost = 0;
        for (Edge edge : result) {
            System.out.println(edge.source + " -- " + edge.destination + " == " + edge.weight);
            minimumCost += edge.weight;
        }
        System.out.println("Minimum Cost Spanning Tree: " + minimumCost);
    }

public class MST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int vertices = 6;
	        MST graph = new MST(vertices);

	        graph.addEdge(0, 1, 4);
	        graph.addEdge(0, 2, 4);
	        graph.addEdge(1, 2, 2);
	        graph.addEdge(1, 0, 4);
	        graph.addEdge(2, 0, 4);
	        graph.addEdge(2, 1, 2);
	        graph.addEdge(2, 3, 3);
	        graph.addEdge(2, 5, 2);
	        graph.addEdge(2, 4, 4);
	        graph.addEdge(3, 2, 3);
	        graph.addEdge(3, 4, 3);
	        graph.addEdge(4, 2, 4);
	        graph.addEdge(4, 3, 3);
	        graph.addEdge(5, 2, 2);
	        graph.addEdge(5, 4, 3);

	        graph.kruskalMST();

	}
}

}
