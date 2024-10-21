package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lê o salario da pessoa
		System.out.println("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();
		
		double taxaImposto = 0;
		
		// Calcula o total de impostos a serem pagos
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if(salario <= 3000.00) {
			// Faixa de R$ 2000.01 a R$ 3000.00: 8% de imposto sobre o valor acima de R$ 2000
			taxaImposto = (salario - 2000.00) * 0.08;
		}
		else if(salario <= 4500.00) {
			// Faixa de R$ 3000.01 a R$ 4500.00: 8% sobre os primeiros R$ 1000 e 18% sobre o restante
			taxaImposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
		}
		else {
			// Acima de R$ 4500.00: 8% sobre os primeiros R$ 1000, 18% sobre os próximos R$ 1500 e 28% sobre o restante
			taxaImposto = (1000.00 * 0.08) + (1500.00 * 0.18 ) + (salario - 4500.00) * 0.28;
		}
		
		// Exibe o valor de impostos a serem pagos
		System.out.printf("Total de Imposto = R$ %.2f%n", taxaImposto);
		
		sc.close();

	}

}
