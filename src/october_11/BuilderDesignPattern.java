package october_11;

class BuilderDesignPattern {
	private String CPU;
	private String RAM;
	private String storage;

	public BuilderDesignPattern(String CPU, String RAM, String storage) {
		this.CPU = CPU;
		this.RAM = RAM;
		this.storage = storage;
	}

	public static void main(String[] args) {
		BuilderDesignPattern computer = new BuilderDesignPattern("Intel i7", "16GB", "512GB SSD");
		System.out.println("Computer details: CPU - " + computer.CPU + ", RAM - " + computer.RAM + ", Storage - "
				+ computer.storage);
	}
}
