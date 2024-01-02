package october_09;

public class Singleton {
	private static Singleton instance;

	private Singleton() {
		// Private constructor to prevent instantiation from other classes.
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// Other methods and fields can be added as needed.
}
