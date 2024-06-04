package ListasExercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * 11- Escrever um programa que leia o nome de um vendedor, o seu salário fixo e
		 * o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
		 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu
		 * nome, o salário fixo e salário no final do mês.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do vendedor:");
		String nomeVendedor = scanner.nextLine();

		System.out.println("Digite o salário fixo do vendedor:");
		double salarioFixo = scanner.nextDouble();

		System.out.println("Digite o total de vendas efetuadas pelo vendedor no mês:");
		double totalVendas = scanner.nextDouble();

		double comissao = totalVendas * 0.15;

		double salarioFinal = salarioFixo + comissao;

		System.out.println("Nome do vendedor: " + nomeVendedor);
		System.out.println("Salário fixo: R$ " + salarioFixo);
		System.out.println("Salário no final do mês: R$ " + salarioFinal);

		scanner.close();

	}

}
