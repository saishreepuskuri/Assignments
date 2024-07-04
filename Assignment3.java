package javaassignments20;

public class Assignment3<T>
{
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	//node class to represent each element in the queue
	private static class Node<T>
	{
		private T data;
		private Node<T> next;
		
		public Node(T data)
		{
			this.data=data;
		}
	}
	
	//constructor to initialize the queue
	
	public Assignment3()
	{
		front=null;
		rear=null;
		size=0;
	}
	//method to add an element to the end of the queue
	public void enqueue(T data)
	{
		Node<T> newNode= new Node<>(data);
		if(rear != null)
		{
			rear.next = newNode;
		}
		rear= newNode;
		if(front == null)
		{
			front = rear;
			
		}
		size++;
	}
	
	//method to remove and return the front element of the queue
	
	public T dequeue()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("queue is empty");
		}
		T data=front.data;
		front = front.next;
		if(front==null)
		{
			rear=null;
		}
		size--;
		return data;
	}
	
	public T peek()
	{
		if(isEmpty())
		{
			throw new IllegalStateException("queue is empty");
		}return front.data;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	//method to check if the queue is empty
	public int size()
	{
		return size;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3<Integer> queue= new Assignment3<>();
		queue.enqueue(10);
		queue.enqueue(10);
		queue.enqueue(10);
		
		System.out.println("queue size:  " + queue.size());
		System.out.println("queue peek:  " + queue.peek());
		System.out.println("queue dequeue:  " + queue.dequeue());
		System.out.println("queue size:  " + queue.size());
		System.out.println("queue isempty:  " + queue.isEmpty());
		
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("queue isempty:  " + queue.isEmpty());
		
		try {
			queue.dequeue();
		}
		catch(IllegalStateException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
