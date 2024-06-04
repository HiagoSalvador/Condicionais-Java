package ListasExercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		// 22- Faça um programa que leia 20 números e, ao final, escreva quantos estão
		// entre 0 e 100

		Scanner scanner = new Scanner(System.in);

		int contador = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite o " + i + "º número:");
			int numero = scanner.nextInt();
			if (numero >= 0 && numero <= 100) {
				contador++;
			}
		}

		System.out.println("O número de números entre 0 e 100 é: " + contador);

		scanner.close();

	}

}
