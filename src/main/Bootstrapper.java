package main;

public class Bootstrapper {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld("John");
		System.out.println(hw.getHello());
	}
}
