package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Lê o codigo e quantidade do item
		System.out.println("Digite o codigo e a quantidade de um item: ");
		int codigoItem = sc.nextInt();
		int quantidadeItem = sc.nextInt();
		
		double totalPago = 0;
		
		// Calcula o valor a pagar usando switch-case
		
		switch (codigoItem) {
			case 1:
				totalPago = 4.00 * quantidadeItem;
				break;
			case 2:	
				totalPago = 4.50 * quantidadeItem;
				break;
			case 3:	
				totalPago = 5.00 * quantidadeItem;
				break;
			case 4:	
				totalPago = 2.00 * quantidadeItem;
				break;
			case 5:	
				totalPago = 1.50 * quantidadeItem;
				break;
			default:
				System.out.println("Codigo invalido!");
				break;
		}
		
		// Exibe o total pago, se o código for válido
		System.out.printf("Total: R$ %.2f%n", totalPago);
		
		sc.close();
	}

}
