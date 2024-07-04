package javaassignments20;

public class Binarysearch {
	public static int binarysearch(int[] array, int target)
	{
		int left =0;
		int right=array.length-1;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			
			//check if the target is at mid
			if(array[mid] == target)
			{
				return mid;
			}
			//if the target is greater , ignore the left half
			if(array[mid]<target)
			{
				return mid;
			}
			
			//if the target is smaller, ignore the right half
			else
			{
				right=mid-1;
			}
		}
		//target not found in the array
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] array= {10,20,30,40,50,60,70};
		int target=40;
		int index=binarysearch(array,target);
		
		if(index != -1)
		{
			System.out.println("element " +target + "found at index" +index);
		}
		else
		{
			System.out.println("element " +target + "not found in the array");
		}
	}

}
