package javaassignments20;

public class Heapsort {
	//method to perform heap sort on an array of integers
	public static void heapsort(int [] array)
	{
		int n=array.length;
		//build a max heap
		for(int i=n/2-1; i>=0; i--)
		{
			heapify(array,n,i);
		}
		//one by one extract elements from the top 
		for(int i=n-1; i>=0; i--)
		{
			//move current root to end
			int temp = array[0];
			array[0]=array[i];
			array[i]=temp;
			
			//call max heapify onn the reduces heap
			heapify(array, i, 0);
		}
	}
	//method to heapify a subtree rooted with node i which is an index in an array
	//n is the size of the heap
	private static void heapify(int[] array, int n, int i)
	{
		int largest = i;
		int left=2*i+1;
		int right=2*i+2;
		//if left child is larges than root
		if(left < n&& array[left] > array [largest])
		{
			largest = right;
		}
		//if largest is not root
		if(largest != i)
		{
			int swap = array[i];
			array[i]=array[largest];
			array[largest]=swap;
			//recursively heapify the affected sub tree
			heapify (array, n, largest);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [ ] array= {23,5,6,745,67,78,90,9};
		System.out.println("unsorted array");
		for(int i:array)
		{
			System.out.println(i+ " ");
		}
		System.out.println();
				
		heapsort(array);
		System.out.println("sorted array");
		for(int i: array)
		{
			System.out.println(i+ " ");
		}

	}

}
