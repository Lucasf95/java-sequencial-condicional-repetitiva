package repetitivas;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lê o numero que sera usado para calcular os divisores
		System.out.print("Qual numero sera calculado os divisores? ");
		int N = sc.nextInt();
		
		// Loop que verifica os divisores
		// O laço verifica todos os números de 1 até N
		for (int i = 1; i <=N; i++) {
			// Se N é divisível por i sem deixar resto (N % i == 0), então i é divisor de N
			if (N % i == 0) {
				System.out.println(i); // Imprime o divisor
			}
		}
		
		sc.close();
	}

}
