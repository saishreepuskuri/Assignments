package javaassignments20;

public class Binarytree {
	
	    // Node class representing each node in the binary tree
	    class Node {
	        int key;
	        Node left, right;

	        public Node(int item) {
	            key = item;
	            left = right = null;
	        }
	    }

	    Node root;

	    // Constructor to initialize the binary tree
	    Binarytree() {
	        root = null;
	    }

	    // Method to insert a new key in the binary tree
	    void insert(int key) {
	        root = insertRec(root, key);
	    }

	    // A recursive function to insert a new key in the binary tree
	    Node insertRec(Node root, int key) {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }

	        if (key < root.key) {
	            root.left = insertRec(root.left, key);
	        } else if (key > root.key) {
	            root.right = insertRec(root.right, key);
	        }

	        return root;
	    }

	    // Method to delete a key from the binary tree
	    void deleteKey(int key) {
	        root = deleteRec(root, key);
	    }

	    // A recursive function to delete a key in the binary tree
	    Node deleteRec(Node root, int key) {
	        if (root == null) {
	            return root;
	        }

	        if (key < root.key) {
	            root.left = deleteRec(root.left, key);
	        } else if (key > root.key) {
	            root.right = deleteRec(root.right, key);
	        } else {
	            // Node with only one child or no child
	            if (root.left == null) {
	                return root.right;
	            } else if (root.right == null) {
	                return root.left;
	            }

	            // Node with two children: get the inorder successor (smallest in the right subtree)
	            root.key = minValue(root.right);

	            // Delete the inorder successor
	            root.right = deleteRec(root.right, root.key);
	        }

	        return root;
	    }

	    // Method to find the minimum value in a tree
	    int minValue(Node root) {
	        int minValue = root.key;
	        while (root.left != null) {
	            minValue = root.left.key;
	            root = root.left;
	        }
	        return minValue;
	    }

	    // Method for inorder traversal of the binary tree
	    void inorder() {
	        inorderRec(root);
	    }

	    // A recursive function for inorder traversal of the binary tree
	    void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key + " ");
	            inorderRec(root.right);
	        }
	    }

	    // Method for preorder traversal of the binary tree
	    void preorder() {
	        preorderRec(root);
	    }

	    // A recursive function for preorder traversal of the binary tree
	    void preorderRec(Node root) {
	        if (root != null) {
	            System.out.print(root.key + " ");
	            preorderRec(root.left);
	            preorderRec(root.right);
	        }
	    }

	    // Method for postorder traversal of the binary tree
	    void postorder() {
	        postorderRec(root);
	    }

	    // A recursive function for postorder traversal of the binary tree
	    void postorderRec(Node root) {
	        if (root != null) {
	            postorderRec(root.left);
	            postorderRec(root.right);
	            System.out.print(root.key + " ");
	        }
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarytree tree = new Binarytree();

        // Insert keys
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print traversals
        System.out.println("Inorder traversal:");
        tree.inorder();

        System.out.println("\nPreorder traversal:");
        tree.preorder();

        System.out.println("\nPostorder traversal:");
        tree.postorder();

        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();

        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }


	}


