package datastrcture.search;

public class Linearsearch {

	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 2, 4, 6, 7, 8, 9, 5, 1 };
		int target = 5;
		int result = linearSearch(numbers, target);
		if (result != -1) {
			System.out.println("element found at an index" + result);

		} else {
			System.out.println("element not found");
		}
	}

}
