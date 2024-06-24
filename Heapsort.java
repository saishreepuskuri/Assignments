package datastrctures.sort;

public class Heapsort {
	public void sort(int arr[]) {
		int N = arr.length;
		// build heap rearrange array

		for (int i = N / 2 - 1; i > 0; i--)
			heapify(arr, N, i);
		// one by one extract an element from heap
		for (int i = N - 1; i > 0; i--) {
			// mover current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			// call max heapify on the reduced heap

			heapify(arr, i, 0);
		}
	}

	// to heapify a subtree rooted with node i which is //
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int N, int i) {
		int largest = i;
		// initialize largest as rooot.
		int l = 2 * i + 1;// left =2*i+1
		int r = 2 * i + 2;// right=2*i+2
		// if left child is larger than root
		if (l < N && arr[i] > arr[largest])
			largest = l;
		// if right child is larger than largest so far
		if (r < N && arr[r] > arr[largest])
			largest = r;
		// if largest is not root
		if (largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			// recursively heapify the affected sub tree
			heapify(arr, N, largest);
		}
	}
	/* a utility function to print array of size n */

	static void printArray(int arr[]) {
		int N = arr.length;
		for (int i = 0; i < N; ++i) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

	// drivers code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 11, 14, 6, 7, 8 };
		int N = arr.length;
		// function call
		Heapsort ob = new Heapsort();
		ob.sort(arr);
		System.out.println("sorted array is ");
		printArray(arr);
	}

}
