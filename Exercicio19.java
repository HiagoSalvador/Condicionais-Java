package ListasExercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		/*
		 * 19- Elaborar um programa que efetue a apresentação do valor da conversão em
		 * real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o
		 * valor da cotação do dólar e também a quantidade de dólares disponíveis com o
		 * usuário.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cotação do dólar:");
		double cotacaoDolar = scanner.nextDouble();

		System.out.println("Digite a quantidade de dólares disponíveis:");
		double quantidadeDolares = scanner.nextDouble();

		double valorEmReais = cotacaoDolar * quantidadeDolares;

		System.out.println("O valor em reais é: R$ " + valorEmReais);

		scanner.close();

	}

}
