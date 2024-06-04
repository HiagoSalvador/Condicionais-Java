package ListasExercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/*
		 * 2- Escreva um programa em Java, que leia um número e informe se ele é
		 * divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		if (numero % 10 == 0) {
			System.out.println("O número é divisível por 10.");
		} else if (numero % 5 == 0) {
			System.out.println("O número é divisível por 5.");
		} else if (numero % 2 == 0) {
			System.out.println("O número é divisível por 2.");
		} else {
			System.out.println("O número não é divisível por 10, por 5 nem por 2.");
		}

		scanner.close();
	}

}
