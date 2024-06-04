package ListasExercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// 18- Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
		Scanner scanner = new Scanner(System.in);

		String nomeMaisNovo = null;
		int idadeMaisNova = Integer.MAX_VALUE;

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o nome da pessoa " + i + ": ");
			String nome = scanner.nextLine();

			System.out.print("Digite a idade de " + nome + ": ");
			int idade = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			if (idade < idadeMaisNova) {
				nomeMaisNovo = nome;
				idadeMaisNova = idade;
			}
		}

		System.out.println("A pessoa mais nova é: " + nomeMaisNovo + ", com " + idadeMaisNova + " anos.");

		scanner.close();

	}

}
