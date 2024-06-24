package wipro;

public class dstest5 {
	public static void addition(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of array: " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50 };
		addition(arr);

	}

}
