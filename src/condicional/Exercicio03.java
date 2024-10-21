package condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lê os valores dos dois numeros inteiros
		System.out.println("Digite dois numeros inteiros: ");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		
		// Verifica se um dos dois números é zero
		if (numero1 == 0 || numero2 == 0) {
			System.out.println("Múltiplos indefinidos.");
		}
		// Verifica se um é múltiplo do outro
		else if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();	
	}
}
