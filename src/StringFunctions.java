import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you string:");

		String name = sc.nextLine();

		String reversedString = new StringBuilder(name).reverse().toString();
		System.out.println(reversedString);
	}

}
	//Option 2
		/*
		 * String reversedString = ""; for (int i=name.length()-1; i>=0; i--) {
		 * reversedString = reversedString + name.charAt(i); }
		 * System.out.println(reversedString);
		 */
