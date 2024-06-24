package wipro;

class Node {
	int key;
	Node prev;
	Node next;

	Node() {
		prev = null;
		next = null;

	}
}

class DoublyLinkedLise {
	static Node head = null;
	static Node first = null;
	static Node tail = null;
	static Node temp = null;
	static int i = 0;

	// add a node
	static void addNode(int k);

	{
	Node ptr = new Node();
	//assign key;
	ptr.key=k;
	//next and prev ptr to null
	ptr.next=null;
	ptr.next=null;
	static void traverse() {
		Node ptr = head;
		while(ptr!= null)
		{
			System.out.println(ptr.key+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	if(head == null)
	{
		head = ptr;
		first =head;
		tail=head;
		
	}
	else//insert at the end of the linkedlist
	{
		temp=ptr;
		first.next=temp;
		temp.prev=first;
		first=temp;
		tail=temp;
		
	}
	i++;
	//Allocate memory to new node
	Node nodeA, nodeB;
	Node ptr=new Node();
	ptr.next = null;
	ptr.prev=null;
	ptr.key=k;
	
	//change the prev and next pointer of the nodes inserted
	nodeB= src;
	nodeA = (src.prev);
	ptr.next=(nodeB);
	prt.prev=(nodeA);
	nodeA.next=ptr;
	nodeB.prev=ptr;
	i++;
	
	static void deleteAtBegining()
	{
		//move head to next and decrease by length 1
		head=head.next;
		i--;
		
	}
	//delete at end
	
	static void deleteAtEnd()
	{
		tail=tail.prev;
		tail.next=null;
		i--;
	}
	//delete at position
	
	Node src=head;
	pos--;
	while(pos--!=0)
	{
		src=src.next;
	}
	Node prev,aftr;
	prev=(src.prev);
	aftr= (src.next);
	//change the next and prev pointer
	prev.next=(aftr);
	aftr.prev=(prev);
	i--;
	
	
}

}

public class linkedlist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addNode(10);
		dll.addNode(20);
		dll.addNode(30);
		dll.addNode(40);
		dll.addNode(50);
		dll.addNode(60);
		dll.addNode(70);
		dll.addNode(80);
		dll.addNode(90);
		dll.addNode(100);
		dll.traverse();

		dll.insertAtBeginning(110);
		dll.traverse();
		dll.insertAtEnd(120);
		dll.traverse();
		dll.insertAtPosition(130, 6);
		dll.traverse();

	}

}
