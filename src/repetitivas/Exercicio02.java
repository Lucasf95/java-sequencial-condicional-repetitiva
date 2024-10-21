package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Solicita a primeira leitura das coordenadas X e Y
		System.out.print("Digite as coordenadas de (X e Y): ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// Continua pedindo as coordenadas enquanto ambos x e y forem diferentes de zero
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante"); // Quadrante 1: x e y positivos
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo quadrante"); // Quadrante 2: x negativo e y positivo
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro quadrante"); // Quadrante 3: x e y negativos
			}
			else {
				System.out.println("Quarto quadrante"); // Quadrante 4: x positivo e y negativo
			}
			
			// Solicita as coordenadas novamente
			System.out.print("Digite as coordenadas de (X e Y): ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
