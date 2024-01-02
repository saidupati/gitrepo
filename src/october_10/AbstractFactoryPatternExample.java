package october_10;

//Abstract Factory Interface
interface AbstractFactory {
	ProductA createProductA();

	ProductB createProductB();
}

//Concrete Factory 1
class ConcreteFactory1 implements AbstractFactory {
	@Override
	public ProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public ProductB createProductB() {
		return new ConcreteProductB1();
	}
}

//Concrete Factory 2
class ConcreteFactory2 implements AbstractFactory {
	@Override
	public ProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public ProductB createProductB() {
		return new ConcreteProductB2();
	}
}

//Abstract Product A
interface ProductA {
	void operationA();
}

//Concrete Product A 1
class ConcreteProductA1 implements ProductA {
	@Override
	public void operationA() {
		System.out.println("Concrete Product A1");
	}
}

//Concrete Product A 2
class ConcreteProductA2 implements ProductA {
	@Override
	public void operationA() {
		System.out.println("Concrete Product A2");
	}
}

//Abstract Product B
interface ProductB {
	void operationB();
}

//Concrete Product B 1
class ConcreteProductB1 implements ProductB {
	@Override
	public void operationB() {
		System.out.println("Concrete Product B1");
	}
}

//Concrete Product B 2
class ConcreteProductB2 implements ProductB {
	@Override
	public void operationB() {
		System.out.println("Concrete Product B2");
	}
}

public class AbstractFactoryPatternExample {
	public static void main(String[] args) {
		AbstractFactory factory1 = new ConcreteFactory1();
		ProductA productA1 = factory1.createProductA();
		ProductB productB1 = factory1.createProductB();

		productA1.operationA();
		productB1.operationB();

		AbstractFactory factory2 = new ConcreteFactory2();
		ProductA productA2 = factory2.createProductA();
		ProductB productB2 = factory2.createProductB();

		productA2.operationA();
		productB2.operationB();
	}
}
