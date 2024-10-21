package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, insira a senha correta: ");
		int senha = sc.nextInt();
		
		// Laço que repete até que a senha correta seja informada
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt(); // Solicita nova tentativa
		}
		
		// Quando a senha estiver correta
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
