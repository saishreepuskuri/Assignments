package javaassignments20;

public class Linkedlist<T> {
	private Node<T> head;
	private int size;
	
	//node class to represent each element in the linkedlist 
	
	private static class Node<T>
	{
		private T data;
		private Node<T>next;
		
		public Node(T data)
		{
			this.data=data;
		}
		
	}
	//construtor a initialize the linkedlist
	public Linkedlist()
	{
		head=null;
		size=0;
	}
	
	
	
	//method to add an element to the end of the linkedlist
	public void add(T data)
	{
		Node<T> newNode= new Node<>(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node<T> current=head;
			while(current.next != null)
			{
				current =current.next;
			}
			current.next = newNode;
		}
		size++;
	}
	
	//method to remove an element by index from the linked list 
	public void remove(int index)
	{
		if(index <0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index : " + index  + ", size" + size);
		}
		if(index == 0) {
			head= head.next;
		}
		else {
			Node<T> current = head;
			for(int i=0; i<index-1; i++)
			{
				current = current.next;
			}
			current.next = current.next.next;
		}
		size++;
	}
	//method to retrieve the element by index from the linkedlist
	
	public T get(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index : " + index  + ", size" + size);
		}
		Node<T> current = head;
		for(int i=0; i<index; i++)
		{
			current = current.next;
		}
		return current.data;
	}
	
	//method to display all elements in the linkedlist
	
	public void display()
	{
		Node<T> current = head;
		while (current != null)
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	//method to display the number of elements in the linkedlist
	public int size()
	{
		return size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist<Integer>list= new Linkedlist<>();
		//adding elements to linkedlist
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		//displaying elements in linkedlist
		System.out.println("linkedlist elemnts");
		list.display();
		
		//retrieving elements by index
		System.out.println("element at index 2: " + list.get(2));
		
		//removing elements from index
		list.remove(2);
		System.out.println("linkedlist elements after removal ");
		list.display();
		
		//checking the size of linkedlist
		System.out.println("size of linkedlist "+list.size());

	}

}
