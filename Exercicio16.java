package ListasExercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		// 16- Leia a idade de 20 pessoas e exiba a média das idades

		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite a idade da " + i + "ª pessoa:");
			int idade = scanner.nextInt();
			soma += idade;
		}

		double media = (double) soma / 20;

		System.out.println("A média das idades das 20 pessoas é: " + media);

		scanner.close();

	}

}
