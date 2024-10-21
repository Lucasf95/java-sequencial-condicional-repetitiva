package repetitivas;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Entrada: o usuário fornece o número para calcular o fatorial
		System.out.print("Qual numero sera utilizado para fatorial? ");
		int N = sc.nextInt();
		
		// Caso especial: o fatorial de 0 é 1 por definição
		if (N == 0) {
			System.out.println("1");
			sc.close();
			return; // Finaliza o programa para não executar o código abaixo
		}
		
		// Inicializa a variável fatorial com valor 1 (valor neutro da multiplicação)
		int fatorial = 1;
		
		// Loop que calcula o fatorial de N
		for (int i = N; i > 0; i--) {
			fatorial = fatorial * i; // Multiplica o valor atual de fatorial pelo contador i
		}
		
		// Saída: imprime o resultado final do fatorial
		System.out.println(fatorial);
		
		sc.close();

	}

}
