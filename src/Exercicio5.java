import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe um número: ");
		Long numero = Long.valueOf(scanner.nextLine());
		scanner.close();
		long start = System.currentTimeMillis();
		System.out.println("Fatorial: " + fatorial(numero));
		System.out.println("Tempo: " + (System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		Long fatorial = 1l;
		for (Long maximo = numero; maximo > 0; maximo--) {
			fatorial *= maximo;
		}
		System.out.println("Fatorial: " + fatorial);
		System.out.println("Tempo: " + (System.currentTimeMillis() - start));
	}
	
	private static long fatorial(long valor) {
		return valor == 1 ? 1 : valor * fatorial(valor - 1);
	}
}
