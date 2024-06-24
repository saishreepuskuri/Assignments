package datastructures.nonlinear;

import java.util.Objects;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public int hashCode() {
		return Objects.hash(name);
	}

	public boolean equals (Object obj)
	{
		if(this == obj) return true;
		if(obj == null) 
	}

}
