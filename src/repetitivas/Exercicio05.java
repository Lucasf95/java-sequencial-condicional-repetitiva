package repetitivas;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário a quantidade de valores a serem digitados
		System.out.print("Quantos valores serao digitados? ");
		int N = sc.nextInt();
		
		// Contadores para valores dentro e fora do intervalo [10, 20]
		int quantidadeFora = 0;
		int quantidadeDentro = 0;
		
		// Loop para ler cada valor e verificar se está dentro ou fora do intervalo
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um valor: ");
			int valor = sc.nextInt(); // Lê o valor digitado pelo usuário
			
			// Verifica se o valor está fora do intervalo [10, 20]
			if (valor < 10 || valor > 20) {
				quantidadeFora += 1;
			}
			else {
				quantidadeDentro += 1;
			}
		}
		
		// Exibe o número de valores dentro e fora do intervalo
		System.out.println(quantidadeDentro + " in");
		System.out.println(quantidadeFora + " out");
		
		sc.close();
	}

}
