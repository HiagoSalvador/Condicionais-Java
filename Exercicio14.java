package ListasExercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		// 14- Escreva um algoritmo que leia 10 números do usuário e calcule a soma
		// desses números

		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número:");
			int numero = scanner.nextInt();
			soma += numero;
		}

		System.out.println("A soma dos 10 números é: " + soma);

		scanner.close();

	}

}
