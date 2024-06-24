package datastrcture.search;

public class Binarysearchproduct {
	public static int BinarySearchById(Product[] products, int id) {
		int low = 0;
		int high = products.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (products[mid].getId() == id) {
				return mid;
			}
			if (products[mid].getId() < id) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Product[] products = { new Product(1, "laptop", 34000), new Product(2, "tv", 89000),
				new Product(3, "washingmachine", 25000), new Product(4, "fan", 2000), new Product(5, "computer", 30000)

		};
		int searchId = 3;
		int result = BinarySearchById(products, searchId);
		if (result == -1) {
			System.out.println("element not found");
		} else {
			System.out.println("element is present at index : " + result);
		}
	}
}
