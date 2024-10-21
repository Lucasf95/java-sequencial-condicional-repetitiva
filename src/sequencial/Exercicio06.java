package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lê os valores de entrada
		// A área do triângulo retângulo que tem A por base e C por altura.
		// A área do círculo de raio C. (pi = 3.14159)
		// A área do trapézio que tem A e B por bases e C por altura.
		// A área do quadrado que tem lado B.
		// A área do retângulo que tem lados A e B.
		System.out.println("Digite o valor de A: ");
		double A = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		double B = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		double C = sc.nextDouble();
		
		// Cálculos das áreas
		double areaTriangulo = (A * C) / 2;
		double areaCirculo = 3.14159 * Math.pow(C, 2.0);
		double areaTrapezio = ((A + B) * C) / 2;
		double areaQuadrado = Math.pow(B, 2.0);
		double areaRetangulo = A * B;
		
		// Exibe os resultados
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
	}

}
