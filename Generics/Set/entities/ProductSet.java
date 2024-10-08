package entities;

import java.util.Objects;

public class ProductSet implements Comparable<ProductSet>{
	
	private String name;
	private Double price;
	
	
	public ProductSet(String name, Double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductSet other = (ProductSet) obj;
		return Objects.equals(name, other.name) && Objects.equals(price, other.price);
	}


	@Override
	public String toString() {
		return "ProductSet [name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(ProductSet other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
	

}
