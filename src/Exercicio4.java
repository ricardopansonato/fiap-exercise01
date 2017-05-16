import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor 1: ");
		Double value1 = Double.valueOf(scanner.nextLine());
		System.out.println("Operador: ");
		String operator = scanner.nextLine();
		System.out.println("Valor 2: ");
		Double value2 = Double.valueOf(scanner.nextLine());
		Double result = null;
		switch (operator) {
			case "+":
				result = value1 + value2;
				break;
			case "-":
				result = value1 - value2;
				break;
			case "/":
				result = value1 / value2;
				break;
			case "*":
				result = value1 * value2;
				break;
			default:

		}
		System.out.println("Resultado: " + result);
		scanner.close();
	}
}
