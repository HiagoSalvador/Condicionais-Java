package ListasExercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		// 24- Escreva um programa que leia uma sequência de números do usuário e
		// realize a soma desses números. Encerre a execução quando um número negativo
		// for digitado.

		Scanner scanner = new Scanner(System.in);

		int soma = 0;
		int numero;

		System.out.println("Digite uma sequência de números (digite um número negativo para encerrar):");

		do {
			System.out.print("Digite um número: ");
			numero = scanner.nextInt();

			// Verifica se o número é positivo antes de adicioná-lo à soma
			if (numero >= 0) {
				soma += numero;
			}
		} while (numero >= 0);

		System.out.println("A soma dos números é: " + soma);

		scanner.close();

	}

}
