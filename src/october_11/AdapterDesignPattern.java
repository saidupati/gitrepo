package october_11;

//Legacy class with an incompatible interface
class LegacyRectangle {
	void draw(int x, int y, int width, int height) {
		// Draw the rectangle using legacy code
		System.out.println("Legacy Rectangle: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height);
	}
}

//New interface expected by the client
interface NewShape {
	void draw(int x1, int y1, int x2, int y2);
}

//Adapter to make LegacyRectangle compatible with NewShape
class AdapterDesignPattern implements NewShape {
	private LegacyRectangle legacyRectangle;

	public AdapterDesignPattern(LegacyRectangle legacyRectangle) {
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		int x = Math.min(x1, x2);
		int y = Math.min(y1, y2);
		int width = Math.abs(x2 - x1);
		int height = Math.abs(y2 - y1);
		legacyRectangle.draw(x, y, width, height);
	}

	public static void main(String[] args) {
		NewShape shape = new AdapterDesignPattern(new LegacyRectangle());
		shape.draw(10, 20, 30, 40);
	}
}
