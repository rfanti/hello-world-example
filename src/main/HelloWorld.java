/**
 * package main;
 */
package main;

/**
 * The HelloWorld class represents a simple example that stores a
 * name and generates a greeting message.
 */
public class HelloWorld {
	/**
	 * The name to be used in the greeting message.
	 */
	private String name;

	/**
	 * Constructs a new HelloWorld instance with the specified name.
	 *
	 * @param name the name to be used in the greeting message
	 */
	public HelloWorld(String name) {
		this.name = name;
	}

	/**
	 * Returns a greeting message that includes the stored name.
	 *
	 * @return a greeting message in the format "Hello world, {name}"
	 */
	public String getHello() {
		return "Hello world, " + name;
	}
}
