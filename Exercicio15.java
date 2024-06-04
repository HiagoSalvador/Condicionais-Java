package ListasExercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		// 15- Leia a idade de 20 pessoas e exiba a soma das idades.

		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite a idade da " + i + "ª pessoa:");
			int idade = scanner.nextInt();
			soma += idade;
		}

		System.out.println("A soma das idades das 20 pessoas é: " + soma);

		scanner.close();

	}

}
