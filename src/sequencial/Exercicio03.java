package sequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Leitura dos valores inteiros A, B, C e D
		System.out.print("Digite o valor de A: ");
		int valorA = sc.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int valorB = sc.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int valorC = sc.nextInt();
		
		System.out.print("Digite o valor de D: ");
		int valorD = sc.nextInt();
		
		// Cálculo da diferença
		int diferenca = (valorA * valorB - valorC * valorD);
		
		// Exibe o resultado
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
