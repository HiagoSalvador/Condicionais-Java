package ListasExercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * 8- Escrever um programa que leia: - a porcentagem do IPI a ser acrescido no
		 * valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de
		 * peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
		 * O programa deve calcular o valor total a ser pago e apresentar o resultado.
		 * Cálculo : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a porcentagem do IPI a ser acrescido:");
		double ipi = scanner.nextDouble();

		System.out.println("Digite o código da peça 1:");
		int codigo1 = scanner.nextInt();
		System.out.println("Digite o valor unitário da peça 1:");
		double valorUnitario1 = scanner.nextDouble();
		System.out.println("Digite a quantidade de peças 1:");
		int quantidade1 = scanner.nextInt();

		System.out.println("Digite o código da peça 2:");
		int codigo2 = scanner.nextInt();
		System.out.println("Digite o valor unitário da peça 2:");
		double valorUnitario2 = scanner.nextDouble();
		System.out.println("Digite a quantidade de peças 2:");
		int quantidade2 = scanner.nextInt();

		double valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100 + 1);

		System.out.println("O valor total a ser pago é: " + valorTotal);

		scanner.close();

	}

}
