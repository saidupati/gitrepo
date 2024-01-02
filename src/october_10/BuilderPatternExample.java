package october_10;

class Product {
	private String part1;
	private String part2;
	private String part3;

	public void setPart1(String part1) {
		this.part1 = part1;
	}

	public void setPart2(String part2) {
		this.part2 = part2;
	}

	public void setPart3(String part3) {
		this.part3 = part3;
	}

	@Override
	public String toString() {
		return "Product [part1=" + part1 + ", part2=" + part2 + ", part3=" + part3 + "]";
	}
}

class ProductBuilder {
	private Product product = new Product();

	public ProductBuilder withPart1(String part1) {
		product.setPart1(part1);
		return this;
	}

	public ProductBuilder withPart2(String part2) {
		product.setPart2(part2);
		return this;
	}

	public ProductBuilder withPart3(String part3) {
		product.setPart3(part3);
		return this;
	}

	public Product build() {
		return product;
	}
}

public class BuilderPatternExample {
	public static void main(String[] args) {
		Product product = new ProductBuilder().withPart1("Part 1").withPart2("Part 2").withPart3("Part 3").build();

		System.out.println(product);
	}
}
