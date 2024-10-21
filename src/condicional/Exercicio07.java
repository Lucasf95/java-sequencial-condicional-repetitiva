package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores x e y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		// Verificação da origem
		if ( x == 0 && y == 0) {
			System.out.println("Origem");
		}
		// Verificação se o ponto está no eixo Y
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        // Verificação se o ponto está no eixo X
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        // Verificação dos quadrantes
        else if (x > 0 && y > 0) {
            System.out.println("Q1 (Primeiro Quadrante)");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2 (Segundo Quadrante)");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3 (Terceiro Quadrante)");
        }
        else {
            System.out.println("Q4 (Quarto Quadrante)");
        }
		
		sc.close();
	}

}
