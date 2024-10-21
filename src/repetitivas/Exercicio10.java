package repetitivas;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário um número inteiro positivo
		System.out.print("Digite um número inteiro positivo: ");
		int N = sc.nextInt();
		
		// Loop para calcular e imprimir o número, seu quadrado e seu cubo
		System.out.println("Número | Quadrado | Cubo");
		System.out.println("-------------------------");
		for (int i = 1; i <= N; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
	}

}
