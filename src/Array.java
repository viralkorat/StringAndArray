import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element to store in Array:");
		int n = sc.nextInt();

		int[] array = new int[10];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array element are:");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		int tempnumber = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					tempnumber = array[i];
					array[i] = array[j];
					array[j] = tempnumber;
				}
			}
		}
		System.out.println();
		System.out.println("Array element in desending order are:");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}
		System.out.println();
		System.out.println("3rd largest array element is:");
		System.out.println(array[n - 8]);

	}
}
