package datastrcture.search;

public class Linearsearchproduct {

	public static Product linearSearchById(Product[] products, int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	{

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = { new Product(1, "lapy", 100000), new Product(2, "tv", 200000),
				new Product(3, "radio", 300000), new Product(4, "speaker", 400000), new Product(5, "dj", 50000), };
		int searchid = 5;
		Product result = linearSearchById(products, searchid);
		if (result != null) {
			System.out.println("Product found: " + result);
		} else {
			System.out.println("product with id " + searchid + "not found");
		}

	}

}
