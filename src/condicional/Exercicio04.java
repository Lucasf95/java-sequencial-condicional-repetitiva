package condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lê que horas o jogo começou e acabou
		System.out.print("Digite a hora inicial e hora final do jogo: ");
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracaoJogo;
		
		//Verifica quantas horas durou o jogo
		if (horaInicial == horaFinal) {
			duracaoJogo = 24;
		}
		else if (horaInicial > horaFinal) {
			duracaoJogo = 24 - horaInicial + horaFinal;
		}
		else  {
			duracaoJogo = horaFinal - horaInicial;
		}
		
		// Exibe o resultado
		System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");
		
		sc.close();
	}

}
