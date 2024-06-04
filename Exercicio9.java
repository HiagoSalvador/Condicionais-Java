package ListasExercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		/*
		 * 9- Crie um programa que leia o valor do salário mínimo e o valor do salário
		 * de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e
		 * imprima o resultado. (Salário mínimo = R$1.212,00).
		 */

		double salarioMinimo = 1212.00;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor do salário do usuário:");
		double salarioUsuario = scanner.nextDouble();

		double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

		System.out.println("O usuário ganha aproximadamente " + quantidadeSalariosMinimos + " salários mínimos.");

		scanner.close();

	}

}
