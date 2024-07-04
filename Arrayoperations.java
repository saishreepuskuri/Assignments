package javaassignments20;


import java.util.Arrays;
public class Arrayoperations {
	private int[] array;
	private int size;
	
	

	public Arrayoperations() {
		
		array =new int[10];
		size = 0;
	}
	//insert element at end
	public void insert(int element)
	{
		ensurecapacity();
		array[size++]=element;
	}
	
	//update element at a specific index
	public void update(int index, int element)
	{
		if(index >= size || index<0)
		{
			throw new IndexOutOfBoundsException("index : " + index + ", size: " + size);
		}
		array[index]=element;
	}
	
	//delete an element at specific index
	public void delete(int index)
	{
		if(index>size || index<0)
		{
			throw new IndexOutOfBoundsException("index : " + index + ", size: " + size);
		}
		for(int i=index; i<size-1; i++) {
			array[i]=array[i+1];
		}
		array[--size]=0;//optional clear the last element
	}
	
	//retrieve element at specific index
	public int get(int index)
	{
		if(index>= size || index<0)
		{
			throw new IndexOutOfBoundsException("index : " + index + ", size: " + size);
		}
		return array[index];
	}
	
	//ensure the array has enough capacity to add new elements
	public void ensurecapacity()
	{
		if(size==array.length)
		{
			array=Arrays.copyOf(array, array.length*2);
			
		}
	}
	
	//get size of dynamic arrray
	public int getsize()
	{
		return size;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayoperations array=new Arrayoperations();
		array.insert(1);
		array.insert(2);
		array.insert(3);
		
		System.out.println("element at index 1: " + array.get(1));
		array.update(1,23);
        System.out.println("update element at index 1: " +array.get(1));
        array.delete(1);
        System.out.println("deleted element at index 1 ,, new element : " + array.get(1));
        System.out.println("size of array " + array.getsize());
        System.out.println();
	}

}
