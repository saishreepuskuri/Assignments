package datastructures.nonlinear;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	private Product product;
	private List<TreeNode> children;

	public TreeNode(Product product) {
		super();
		this.product = product;
		this.children = new ArrayList<>();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public void addchild(TreeNode child) {
		this.children.add(child);
	}

	@Override
	public String toString() {
		return "TreeNode [product=" + product + ", children=" + children + "]";
	}

}

public class Tree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product("laptop", 65000);
		Product p2 = new Product("desktop", 45000);
		Product p3 = new Product("tab", 15000);

		TreeNode root = new TreeNode(p1);
		TreeNode node1 = new TreeNode(p2);
		TreeNode node2 = new TreeNode(p3);

		root.addchild(node1);
		root.addchild(node2);
		System.out.println(root);

	}

}
