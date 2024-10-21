package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Solicita o número de casos de teste
		System.out.println("Quantos casos serao digitados? ");
		int numeroDeCasos = sc.nextInt();
		
		// Loop para processar cada caso de teste
		for (int i = 0; i < numeroDeCasos; i++) {
			System.out.println("Digite 3 valores reais: ");
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			// Cálculo da média ponderada com os pesos 2, 3 e 5
			double somaPesos = 2 + 3 + 5;
			double mediaPonderada = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / somaPesos;
			
			// Exibir o resultado formatado com uma casa decimal
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();
	}

}
