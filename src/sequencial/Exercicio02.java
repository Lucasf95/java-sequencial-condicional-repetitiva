package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // Configuração regional
		
		// Lê o valor do raio do circulo
		System.out.println("Vamos calcular a area de um circulo.");
        System.out.print("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();
		
        // Calcula a area do circulo
        double area = 3.14159 * Math.pow(raio, 2.0);
	    
        // Exibe a area do circulo
        System.out.printf("Area = %.4f%n", area);

		sc.close();
	}
}
