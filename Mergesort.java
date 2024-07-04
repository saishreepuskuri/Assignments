package javaassignments20;

public class Mergesort {
	//method to perform merge sort on array of integers
	public static void mergesort(int [] array)
	{
		if(array.length<2)
		{
			return;
		}
		int mid=array.length/2;
		int[] left = new int[mid];
		int[] right = new int[array.length-mid];
		
		//split the array into two halves
		for(int i=0; i<mid; i++)
		{
			left[i] = array[i];
		}
		for(int i=mid; i<array.length; i++)
		{
			right[i-mid]=array[i];
		}
		//recusively sort the two halves
		
		mergesort(left);
		mergesort(right);
		//merge the sorted halves
		merge(array, left, right);
	}
	//method to merge two sorted arrays into a single sorted array
	private static void merge(int[] array, int[] left, int[] right)
	{
		int i=0, j=0, k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i] <= right[j])
			{
				array[k++] = left[i++];
				
			}
			else {
				array[k++] = right [j++];
			}
		}
		while(i<left.length)
		{
			array[k++] = left[i++];
		}
		while(j<right.length)
		{
			array[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {10,34,5,7,88,345,56,678,32,67};
		System.out.println("unsorted aarray");
		for(int i:array)
		{
			System.out.println(i + " ");
		}
		System.out.println();
		mergesort(array);
		System.out.println("sorted array");
		for(int i: array)
		{
			System.out.println(i + " ");
		}

	}

}
