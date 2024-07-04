package javaassignments20;

public class Linearsearch {
//method to perfrom linear search on an array of integers
	public static int linearsearch(int[] array, int target)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {10,20,30,40,50};
		int target=90;
		int index = linearsearch(array, target);
		if(index != -1)
		{
			System.out.println("element "+ target + "found at index " +index);
		}
		else
		{
			System.out.println("element " +target + " not found in the array");
		}

	}

}
