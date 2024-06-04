package ListasExercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		// 20- Escreva um programa que leia 20 números do usuário e exiba quantos
		// números são maiores do que 8.

		Scanner scanner = new Scanner(System.in);

		int contadorMaioresQueOito = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite o " + i + "º número:");
			int numero = scanner.nextInt();
			if (numero > 8) {
				contadorMaioresQueOito++;
			}
		}

		System.out.println("O número de números maiores que 8 é: " + contadorMaioresQueOito);

		scanner.close();

	}

}
