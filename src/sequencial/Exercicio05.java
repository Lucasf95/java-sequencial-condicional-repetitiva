package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lê informações da peça 1
		System.out.print("Digite o codigo da peca 1: ");
		int codigoPeca1 = sc.nextInt();
		
		System.out.print("Numero de pecas 1: ");
		int quantidadePecas1 = sc.nextInt();
		
		System.out.println("Valor unitario da peca 1: ");
		double precoPeca1 = sc.nextDouble();
		
		// Lê informações da peça 2
		System.out.print("Digite o codigo da peca 2: ");
		int codigoPeca2 = sc.nextInt();
		
		System.out.print("Numero de pecas 2: ");
		int quantidadePecas2 = sc.nextInt();
		
		System.out.println("Valor unitario da peca 2: ");
		double precoPeca2 = sc.nextDouble();
		
		// Calcula o valor a ser pago
		double valorPago = (quantidadePecas1 * precoPeca1) + (quantidadePecas2 * precoPeca2);
		
		// Exibe o valor a ser pago
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
		
		sc.close();

	}

}
