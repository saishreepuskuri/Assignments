package javaassignments20;
import java.util.*;

class WeightedGraph {
    private Map<Integer, List<Edge>> adjList;

    public WeightedGraph() {
        this.adjList = new HashMap<>();
    }

    // Add a vertex
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge
    public void addEdge(int vertex1, int vertex2, int weight) {
        adjList.putIfAbsent(vertex1, new ArrayList<>());
        adjList.putIfAbsent(vertex2, new ArrayList<>());
        adjList.get(vertex1).add(new Edge(vertex2, weight));
        adjList.get(vertex2).add(new Edge(vertex1, weight)); // Since the graph is undirected
    }

    // Dijkstra's algorithm
    public Map<Integer, Integer> dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        Map<Integer, Integer> distances = new HashMap<>();
        Set<Integer> visited = new HashSet<>();

        // Initialize distances with infinity
        for (Integer vertex : adjList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;

            if (!visited.add(currentVertex)) continue;

            for (Edge edge : adjList.getOrDefault(currentVertex, new ArrayList<>())) {
                int neighbor = edge.vertex;
                int newDist = distances.get(currentVertex) + edge.weight;

                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    pq.add(new Node(neighbor, newDist));
                }
            }
        }

        return distances;
    }
public class Dijkstrasalgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightedGraph graph = new WeightedGraph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        graph.addEdge(1, 2, 10);
        graph.addEdge(1, 3, 20);
        graph.addEdge(2, 4, 5);
        graph.addEdge(3, 5, 10);
        graph.addEdge(4, 5, 2);

        Map<Integer, Integer> distances = graph.dijkstra(1);

        System.out.println("Shortest distances from vertex 1:");
        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            System.out.println("Vertex " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

class Edge {
    int vertex;
    int weight;

    public Edge(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

class Node {
    int vertex;
    int distance;

    public Node(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;

	}

}
}
