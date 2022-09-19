import java.util.Scanner;

public class TotalEvenNumbersInArray {

	public static void main(String[] args) {
		int evenCount = 0;
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
		System.out.println("");
		System.out.println("Even Numbers:");
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i]+ " ");
				evenCount++;
			} 
		}System.out.println("");
		System.out.println("Total Number of Even Numbers in this Array = " + evenCount);
	}
}
