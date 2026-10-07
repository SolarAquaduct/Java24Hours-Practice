//this newer version is self suffecient in one class

import java.util.Scanner;
public class Root {
	public static void main(String[] args) {
		System.out.println("============== Sqaure root calculator ==============");
		System.out.println("Please enter a number");

		Scanner scanner = new Scanner(System.in);
        double sqrRoot = Math.sqrt(scanner.nextDouble());

		System.out.println("The square root is: " + String.format("%.2f", sqrRoot));
	}
}
