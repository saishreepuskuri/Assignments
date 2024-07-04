package javaassignments20;

import java.util.EmptyStackException;

public class Stack<T>
{
	private Node<T> top;
	private int size;
	
	private static class Node<T>
	{
		private T data;
		private Node<T>next;
		public Node(T data)
		{
			this.data=data;
		}
	}
	

//constructor to initialize the stack
public Stack()
{
	top=null;
	size=0;
}

//method to add an element at the top of the stack
public void push(T data)
{
	Node<T> newNode= new Node<>(data);
	newNode.next=top;
	top= newNode;
	size++;
}
//method to remove and return the top element

public T pop()
{
	if (isEmpty())
	{
		throw new EmptyStackException();
		
	}
	T data = top.data;
	top= top.next;
	size--;
	return data;
	
}

//method to check if stack is empty
public boolean isEmpty()
{
	return top==null;
}
//method to return no of elements in stack
public int size()
{
	return size;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(11);
		stack.push(13);
		
		System.out.println("satck size : "+ stack.size());
		System.out.println("pop: "+ stack.pop());
		System.out.println("satck size : "+ stack.size());
		System.out.println("satck is empty : "+ stack.isEmpty());
		
		stack.pop();
		stack.pop();
		
		System.out.println("satck is empty ?  : "+ stack.isEmpty());
		try {
			stack.pop();
		}
		catch(EmptyStackException e)
		{
			System.out.println("stack is empty, cannot pop ");//stack emty cant pop
		}
		
	}
}


