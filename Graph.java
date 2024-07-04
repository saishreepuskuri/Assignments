package javaassignments20;


	import java.util.*;

	public class Graph {
	    private Map<Integer, List<Integer>> adjList;

	    public Graph() {
	        this.adjList = new HashMap<>();
	    }

	    // Add a vertex
	    public void addVertex(int vertex) {
	        adjList.putIfAbsent(vertex, new ArrayList<>());
	    }

	    // Add an edge
	    public void addEdge(int vertex1, int vertex2) {
	        adjList.putIfAbsent(vertex1, new ArrayList<>());
	        adjList.putIfAbsent(vertex2, new ArrayList<>());
	        adjList.get(vertex1).add(vertex2);
	        adjList.get(vertex2).add(vertex1); // Since the graph is undirected
	    }

	    // Remove a vertex
	    public void removeVertex(int vertex) {
	        if (!adjList.containsKey(vertex)) return;
	        adjList.values().forEach(e -> e.remove(Integer.valueOf(vertex)));
	        adjList.remove(vertex);
	    }

	    // Remove an edge
	    public void removeEdge(int vertex1, int vertex2) {
	        List<Integer> list1 = adjList.get(vertex1);
	        List<Integer> list2 = adjList.get(vertex2);
	        if (list1 != null) list1.remove(Integer.valueOf(vertex2));
	        if (list2 != null) list2.remove(Integer.valueOf(vertex1));
	    }

	    // Check if a vertex exists
	    public boolean hasVertex(int vertex) {
	        return adjList.containsKey(vertex);
	    }

	    // Check if an edge exists
	    public boolean hasEdge(int vertex1, int vertex2) {
	        return adjList.containsKey(vertex1) && adjList.get(vertex1).contains(vertex2);
	    }

	    // Depth First Search (DFS)
	    public void DFS(int start) {
	        Set<Integer> visited = new HashSet<>();
	        DFSUtil(start, visited);
	    }

	    private void DFSUtil(int vertex, Set<Integer> visited) {
	        if (!visited.contains(vertex)) {
	            visited.add(vertex);
	            System.out.print(vertex + " ");
	            for (int neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
	                DFSUtil(neighbor, visited);
	            }
	        }
	    }

	    // Breadth First Search (BFS)
	    public void BFS(int start) {
	        Set<Integer> visited = new HashSet<>();
	        Queue<Integer> queue = new LinkedList<>();
	        visited.add(start);
	        queue.add(start);

	        while (!queue.isEmpty()) {
	            int vertex = queue.poll();
	            System.out.print(vertex + " ");
	            for (int neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
	                if (!visited.contains(neighbor)) {
	                    visited.add(neighbor);
	                    queue.add(neighbor);
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Graph graph = new Graph();
	        graph.addVertex(1);
	        graph.addVertex(2);
	        graph.addVertex(3);
	        graph.addEdge(1, 2);
	        graph.addEdge(2, 3);

	        System.out.println("Graph:");
	        graph.DFS(1);  // Output: 1 2 3
	        System.out.println();
	        graph.BFS(1);  // Output: 1 2 3

	        System.out.println("\nHas Vertex 2: " + graph.hasVertex(2));  // Output: true
	        System.out.println("Has Edge 1-2: " + graph.hasEdge(1, 2));  // Output: true

	        graph.removeEdge(1, 2);
	        System.out.println("Has Edge 1-2: " + graph.hasEdge(1, 2));  // Output: false

	        graph.removeVertex(3);
	        System.out.println("Has Vertex 3: " + graph.hasVertex(3));  // Output: false
	    }
	}

	