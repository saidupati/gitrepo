package october_11;

interface DrawingAPI {
	void drawCircle(int x, int y, int radius);
}

class DrawingAPI1 implements DrawingAPI {
	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("Drawing with API 1: x=" + x + ", y=" + y + ", radius=" + radius);
	}
}

class DrawingAPI2 implements DrawingAPI {
	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("Drawing with API 2: x=" + x + ", y=" + y + ", radius=" + radius);
	}
}

abstract class Shape {
	protected DrawingAPI drawingAPI;

	protected Shape(DrawingAPI drawingAPI) {
		this.drawingAPI = drawingAPI;
	}

	public abstract void draw();
}

class BridgeDesignPattern extends Shape {
	private int x, y, radius;

	public BridgeDesignPattern(int x, int y, int radius, DrawingAPI drawingAPI) {
		super(drawingAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

	public static void main(String[] args) {
		Shape circle = new BridgeDesignPattern(100, 100, 50, new DrawingAPI1());
		circle.draw();

		Shape anotherCircle = new BridgeDesignPattern(200, 200, 40, new DrawingAPI2());
		anotherCircle.draw();
	}
}
