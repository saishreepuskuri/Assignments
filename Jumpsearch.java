package datastrcture.search;

public class Jumpsearch {

	static int jumpSearch(int[] arr, int x) {
		int n = arr.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;
		for (int minStep = Math.min(step, n) - 1; arr[minStep] < x; minStep = Math.min(step, n) - 1) {
			prev = step;
			step = +(int) Math.floor(Math.sqrt(Math.sqrt(n)));
			if (prev >= n) {
				return -1;
			}
			while (arr[prev] < x) {
				prev++;
				if (prev == Math.min(step, n))
					return -1;
			}
			if (arr[prev] == x)
				return prev;

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 56, 7, 89, 34, 45, 79 };
		int x = 55;
		int result = jumpSearch(arr, x);
		System.out.println("/n Number : " + x + " is at index : " + result);

	}

}
