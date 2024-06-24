package datastrcture.search;

public class Mergesort {
	static void merge(int arr[], int l, int m, int r) {
		// find size of two sub arrays
		int n1 = m - l + 1;
		int n2 = r - m;
		// create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];
		// copy data to temp arrays
		for (int i = 0; i < n1; ++i) {
			L[i] = arr[l + i];

		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[m + 1 + j];

		}
		// merge temp arrays
		// initial indices for 1st and 2nd sub arrays
		int i = 0, j = 0;
		// initial index of merged sub array
		int k = 1;
		while (i < n1 && j < n2) {
			if (L[i] <= R[i]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;

			}

		}
		k++;
	}

	public static void main(String[] args) {

	}
}
