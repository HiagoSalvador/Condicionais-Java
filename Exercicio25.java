package ListasExercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		/*
		 * 25 - Escreva um algoritmo que leia uma sequência de números do usuário e
		 * realize e a soma desses números. Encerre a execução quando um número negativo
		 * for digitado.
		 */

		Scanner scanner = new Scanner(System.in);

		int soma = 0;
		int numero;

		System.out.println("Digite uma sequência de números (digite um número negativo para encerrar):");

		System.out.print("Digite um número: ");
		numero = scanner.nextInt();

		while (numero >= 0) {
			soma += numero;

			System.out.print("Digite um número: ");
			numero = scanner.nextInt();
		}

		System.out.println("A soma dos números é: " + soma);

		scanner.close();
	}

}
