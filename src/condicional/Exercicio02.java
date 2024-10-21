package condicional;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário que digite um numero inteiro
		System.out.print("Digite um numero inteiro: ");
		int numeroInteiro = sc.nextInt();
		
		// Verifica se o numero é par ou impar
		if (numeroInteiro % 2 == 0) {
			System.out.println("O numero " + numeroInteiro + " eh PAR");
		}
		else {
			System.out.println("O numero " + numeroInteiro + " eh IMPAR");
		}
		sc.close();
	}

}
