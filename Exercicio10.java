package ListasExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		/*
		 * 10- Informar um saldo e imprimir o saldo com reajuste de 1.5%.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o saldo:");
		double saldo = scanner.nextDouble();

		double saldoReajustado = saldo * 1.015;

		DecimalFormat df = new DecimalFormat("#.##");
		String saldoFormatado = df.format(saldoReajustado);

		System.out.println("O saldo com reajuste de 1.5% é: " + saldoFormatado);

		scanner.close();
	}

}
