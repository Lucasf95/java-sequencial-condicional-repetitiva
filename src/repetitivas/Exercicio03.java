package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Solicita o código de combustível ao usuário
		System.out.println("Digite um codigo de combustivel: ");
		int codigoCombustivel = sc.nextInt();
		
		int contagemAlcool = 0;
		int contagemGasolina = 0;
		int contagemDiesel = 0;
		
		// Loop que continua até o código 4 (Fim) ser inserido
		while (codigoCombustivel != 4) {
			// Verifica o tipo de combustível e incrementa o respectivo contador
			switch (codigoCombustivel) {
			case 1:
				contagemAlcool += 1; // Incrementa a contagem de Álcool
				break;
			case 2:
				contagemGasolina += 1; // Incrementa a contagem de Gasolina
				break;
			case 3:
				contagemDiesel += 1; // Incrementa a contagem de Diesel
				break;
			default:
				// Caso o código seja inválido, exibe uma mensagem de erro
				System.out.println("Codigo invalido, digite novamente (1, 2, 3 ou 4)");
			}
			// Solicita novo código de combustível
			codigoCombustivel = sc.nextInt();
		}
		// Exibe os resultados finais após a saída do loop
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contagemAlcool);
		System.out.println("Gasolina: " + contagemGasolina);
		System.out.println("Diesel: " + contagemDiesel);
		
		sc.close();

	}

}
