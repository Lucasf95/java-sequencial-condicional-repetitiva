package repetitivas;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário que insira um valor inteiro
		System.out.print("Digite um valor inteiro entre 1 e 1000: ");
		int valorMaximo = sc.nextInt();
		
		if (valorMaximo < 1 || valorMaximo > 1000) {
			System.out.println("Valor fora do intervalo permitido.");
		}
		else {
		// Itera de 1 até o valor máximo informado
		for (int i = 1; i <= valorMaximo; i++) {
			// Verifica se o número é impar
			if (i % 2 != 0) {
				// Exibe o número impar
				System.out.println(i);
			}
		}
		}
		
		sc.close();
	}

}
