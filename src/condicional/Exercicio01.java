package condicional;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Solicita ao usuário que digite um número inteiro
		System.out.print("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		// Verifica se o número é negativo
		if (numero < 0) {
		    System.out.println("NEGATIVO");
		} else {
		    System.out.println("NAO NEGATIVO");
		}

		sc.close();
	}

}
