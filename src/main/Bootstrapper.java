/**
 * The Bootstrapper class serves as the entry point for the application.
 */
package main;

/**
 * The Bootstrapper class serves as the entry point for the application.
 * It initializes a HelloWorld instance with a given name and prints the
 * greeting message to the console.
 */
public class Bootstrapper {

	/**
	 * The main method is the entry point for the application.
	 * It initializes a HelloWorld instance with a given name and prints the
	 * greeting message to the console.
	 *
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("John");
		System.out.println(hw.getHello());
	}
}
