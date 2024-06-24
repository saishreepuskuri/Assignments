package wipro;

public class linkedlist2 {
	class LinkedList {
		Node head;

		static class Node {
			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}
		}

		// method to insert new node
		public static LinkedList insert(LinkedList list, int data) {
			// creating a new node with given data
			Node new_node = new Node(data);
			// if list is empty then we make node as head
			if (list.head == null) {
				list.head = new_node;
			} else {
				// traverse till last node and insert new node
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}
				// insert new_node at last node
				last.next = new_node;
			}
			// return the list by head
			return list;
		}

		// print the linkedlist
		public static void printList(LinkedList list) {
			Node currNode = list.head;
			System.out.println("LinkedList");
			// traversing through out the list
			while (currNode != null) {
				// printing current node
				System.out.println(currNode.data + " ");
				// go to next node
				currNode = currNode.next;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// starts with empty list
		LinkedList list = new LinkedList();
		// inserting values
		list = list.insert(list, 10);
		list = list.insert(list, 20);
		list = list.insert(list, 30);
		list = list.insert(list, 40);
		list = list.insert(list, 50);
		list = list.insert(list, 60);
		list = list.insert(list, 70);
		list = list.insert(list, 80);
		list = list.insert(list, 90);
		list = list.insert(list, 100);
		// printing the linklist
		list.printList(list);

	}

}
