package datastructures.nonlinear;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

class Edge {

	private Product start;
	private Product end;
	private String type;

	// parameterized constructord
	public Edge(Product start, Product end, String type) {
		super();
		this.start = start;
		this.end = end;
		this.type = type;
	}

	// getters setters
	public Product getStart() {
		return start;
	}

	public void setStart(Product start) {
		this.start = start;
	}

	public Product getEnd() {
		return end;
	}

	public void setEnd(Product end) {
		this.end = end;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// toStringmethod
	@Override
	public String toString() {
		return "Edge [start=" + start + ", end=" + end + ", type=" + type + "]";
	}

}

class ProductGraph {
	private List<Product> products;
	private List<Edge> edges;

	public ProductGraph() {

		this.products = new ArrayList<>();
		this.edges = new ArrayList<>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addEdge(Product start, Product end, String type) {
		Edge edge = new Edge(start, end, type);
		edges.add(edge);
		// assuming graph is undirected , so we add edges in both directions

		edges.add(new Edge(end, start, type));

	}

	// check if product exists
	public boolean containsProduct(Product product) {
		return products.contains(product);
	}

	public List<Edge> getEdgesForProduct(Product product) {
		List<Edge> result = new ArrayList<>();
		for (Edge edge : edges) {
			if (edge.getStart().equals(product)) {
				result.add(edge);
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "ProductGraph [products=" + products + ", edges=" + edges + "]";
	}

}

public class Graph1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductGraph graph = new ProductGraph();
		Product p1 = new Product("laptop", 65000);
		Product p2 = new Product("desktop", 45000);
		Product p3 = new Product("tab", 15000);

		graph.addProduct(p1);
		graph.addProduct(p2);
		graph.addProduct(p3);

		graph.addEdge(p1, p2, "Type1");
		graph.addEdge(p2, p3, "Type2");

		System.out.println(graph);
		System.out.println("edges forproduct1 : " + graph.getEdgesForProduct(p1));

	}

}
