package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Solicitando a quantidade de divisões que serão realizadas
		System.out.print("Quantas divisoes serao feitas? ");
		int N = sc.nextInt();
		// Loop para processar as divisões
		for (int i = 0; i < N; i++ ) {
			System.out.println("Digite dois numeros inteiros:");
			int numero1 = sc.nextInt();
			int numero2 = sc.nextInt();
			
			// Verificar se o divisor é zero para evitar divisão por zero
			if (numero2 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				// Realizando a divisão e imprimindo o resultado com 1 casa decimal
				double resultado = (double) numero1 / numero2;
				System.out.printf("%.1f%n", resultado);
			}
		}
		
		sc.close();
	}

}
