package datastrctures.sort;

public class BubbleSort {
	static void bubblesort(int arr[], int n) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
	}

	static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 23, 4, 556, 34, 12, 1, 45, 666667, 76 };
		int n = arr.length;
		bubblesort(arr, n);
		System.out.println("sorted array is: ");
		printArray(arr, n);

	}

}
