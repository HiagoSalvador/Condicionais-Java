package ListasExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3- A CEF concederá um crédito especial com juros de 2% aos seus clientes de
		 * acordo com o saldo médio no último ano. Fazer um programa em JAVA que leia o
		 * saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela
		 * a seguir. Imprimir uma mensagem informando o saldo médio e o valor de
		 * crédito.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o saldo médio do último ano: ");
		double saldoMedio = scanner.nextDouble();

		double valorCredito;
		if (saldoMedio <= 500) {
			valorCredito = 0;
		} else if (saldoMedio <= 1000) {
			valorCredito = saldoMedio * 0.30;
		} else if (saldoMedio <= 3000) {
			valorCredito = saldoMedio * 0.40;
		} else {
			valorCredito = saldoMedio * 0.50;
		}

		System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
		System.out.printf("Valor do crédito: R$ %.2f\n", valorCredito);

		scanner.close();
	}

}
