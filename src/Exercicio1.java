import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Total de valores: ");
		int total = scanner.nextInt();
		int[] totalElements = new int[total];
		int[] reverseElements = new int[total];
		for (int i = 0; i < total; i++) {
			System.out.println("Valor[" + i + "]:");
			totalElements[i] = scanner.nextInt();
		}
		
		for (int i = 0, j = total - 1; i < total; j--, i++) {
			reverseElements[i] = totalElements[j];
		}
		
		System.out.println("Array A: " + Arrays.toString(totalElements));
		System.out.println("Array B: " + Arrays.toString(reverseElements));
		scanner.close();
	}
}
