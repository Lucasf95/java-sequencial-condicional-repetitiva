package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lê o número do funcionário
		System.out.print("Digite o numero do funcionario: ");
		int numeroFuncionario  = sc.nextInt();
		
		// Lê as horas trabalhadas
		System.out.print("Quantas horas trabalhadas? ");
		int horasTrabalhadas = sc.nextInt();
		
		// Lê o valor que o funcionário recebe por hora
		System.out.print("Recebe quanto por hora? ");
		double valorHora = sc.nextDouble();
		
		// Calcula o salário
		double salarioFuncionario = horasTrabalhadas * valorHora;
		
		// Exibe o número e salário do funcionário
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salarioFuncionario);
		
		sc.close();

	}

}
