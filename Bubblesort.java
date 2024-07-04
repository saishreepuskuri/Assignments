package javaassignments20;

public class Bubblesort {
	//method to perform bubble sort on an array integers
	public static void bubblesort(int[] array)
	{
		int n=array.length;
		boolean swapped;
		for(int i=0; i<n-1; i++)
		{
			swapped = false;
			
			for(int j=0; j<n-1-i; j++)
			{
				if(array[j] >array[j+1])
						{
					//swap array[j and array[j+1]
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1] = temp;
					swapped= true;
					}
			}
			// if no two elements were swapped in the inner loop, the array is already sorted
			if(!swapped)
			{
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {3,5,67,8,23,53,98,123};
		System.out.println("unsotedarray");
		for(int i: array)
		{
			System.out.println(i + " ");
		}
		System.out.println();
		
		bubblesort(array);
		System.out.println("sorted array : ");
		for(int i: array)
		{
			System.out.println(i + " ");
		}

	}

}
