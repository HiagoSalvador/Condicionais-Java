package ListasExercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		// 17- Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade

		Scanner scanner = new Scanner(System.in);

		int contadorMaioresIdade = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.println("Digite a idade da " + i + "ª pessoa:");
			int idade = scanner.nextInt();
			if (idade >= 18) {
				contadorMaioresIdade++;
			}
		}

		System.out.println("O número de pessoas maiores de idade é: " + contadorMaioresIdade);

		scanner.close();

	}

}
