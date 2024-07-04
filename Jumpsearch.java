package javaassignments20;

public class Jumpsearch {

	//method to perfrom jump search on a sorted array of integers
	public static int jumpsearch(int[] array, int target)
	{
		int n= array.length;
		int step = (int)Math.floor(Math.sqrt(n));
		int prev=0;
		//finding the block where the elementb may be present
		while(array[Math.min(step, n)-1]< target)
		{
			prev= step;
			step += (int)Math.floor(Math.sqrt(n));
			if(prev >= n)
			{
				return -1;
			}
		}
		while(array[prev]<target)
		{
			prev++;
			if(prev == Math.min(step, n))
			{
				return -1;
			}
		}
		//if the elemsnt is found
		if(array[prev]==target)
		{
			return prev;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,40,50,60,70,80,90,100};
		int target = 70;
		int index = jumpsearch(array,target);
		if(index != -1)
		{
			System.out.println("element " +target + "found at index" +index);
		}
		else
		{
			System.out.println("element " + target + "not found");
		}

	}

}
