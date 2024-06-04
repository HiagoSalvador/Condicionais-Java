package ListasExercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		/*
		 * 21- A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
		 * prestações sem juros. Faça um programa que receba um valor de uma compra e
		 * mostre o valor das prestações.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor da compra:");
		double valorCompra = scanner.nextDouble();

		double valorPrestacao = valorCompra / 5;

		System.out.println("O valor de cada prestação é: R$ " + valorPrestacao);

		scanner.close();

	}

}
