package sequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lê dois números inteiros
		System.out.println("Soma de dois numeros inteiros!");
		System.out.print("Digite o primeiro numero: ");
		int primeiroNumero = sc.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		int segundoNumero = sc.nextInt();
		
		// Calcula a soma
		int soma = primeiroNumero + segundoNumero;
		
		// Exibe o resultado
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
