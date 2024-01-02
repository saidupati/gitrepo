package october_11;

interface Visitor {
	void visit(ElementA element);

	void visit(ElementB element);
}

interface Element {
	void accept(Visitor visitor);
}

class ElementA implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}

class ElementB implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}

class VisitorDesignPattern implements Visitor {
	@Override
	public void visit(ElementA element) {
		System.out.println("Visited ElementA");
	}

	@Override
	public void visit(ElementB element) {
		System.out.println("Visited ElementB");
	}

	public static void main(String[] args) {
		Element elementA = new ElementA();
		Element elementB = new ElementB();
		Visitor visitor = new VisitorDesignPattern();

		elementA.accept(visitor);
		elementB.accept(visitor);
	}
}
