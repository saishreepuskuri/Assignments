package javaassignments20;
import java.util.*;

class Edge {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class BellmanFordAlgorithm {
    private int vertices;
    private List<Edge> edges;

    public BellmanFordAlgorithm(int vertices) {
        this.vertices = vertices;
        edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    public void bellmanFord(int startVertex) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;

        // Relax edges |V| - 1 times
        for (int i = 1; i < vertices; ++i) {
            for (Edge edge : edges) {
                if (distances[edge.source] != Integer.MAX_VALUE &&
                    distances[edge.source] + edge.weight < distances[edge.destination]) {
                    distances[edge.destination] = distances[edge.source] + edge.weight;
                }
            }
        }

        // Check for negative weight cycles
        for (Edge edge : edges) {
            if (distances[edge.source] != Integer.MAX_VALUE &&
                distances[edge.source] + edge.weight < distances[edge.destination]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        printSolution(distances, startVertex);
    }

    private void printSolution(int[] distances, int startVertex) {
        System.out.println("Vertex distances from source vertex " + startVertex);
        for (int i = 0; i < vertices; ++i) {
            System.out.println("Vertex " + i + " -> Distance " + distances[i]);
        }
    }
public class Bellmanford {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = 5;
        BellmanFordAlgorithm graph = new BellmanFordAlgorithm(vertices);

        graph.addEdge(0, 1, -1);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 4, 2);
        graph.addEdge(3, 2, 5);
        graph.addEdge(3, 1, 1);
        graph.addEdge(4, 3, -3);

        int startVertex = 0;
        graph.bellmanFord(startVertex);

	}

}
}
