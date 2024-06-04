package ListasExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 1-Criar um programa em Java, que informe a quantidade total de calorias de
		 * uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a
		 * bebida (veja a tabela a seguir). Sugestão: enumere cada opção de prato,
		 * sobremesa e bebida. Ou seja: Prato: 1 - vegetariano, 2 – Peixe, 3 – Frango, 4
		 * – Carne; Sobremesa: 1 – Abacaxi, 2 – Sorvete diet, 3 – Mouse diet, 4 – Mouse
		 * chocolate; Bebida: 1 – Chá, 2 - Suco de laranja, 3 – Suco de melão, 4 –
		 * Refrigerante diet.
		 */

		int[] caloriasPratos = { 180, 230, 250, 350 };
		int[] caloriasSobremesas = { 75, 110, 170, 200 };
		int[] caloriasBebidas = { 20, 70, 100, 65 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escolha o prato:");
		System.out.println("1 - Vegetariano (180 cal)");
		System.out.println("2 - Peixe (230 cal)");
		System.out.println("3 - Frango (250 cal)");
		System.out.println("4 - Carne (350 cal)");
		System.out.print("Digite o número correspondente ao prato: ");
		int escolhaPrato = scanner.nextInt();

		System.out.println("Escolha a sobremesa:");
		System.out.println("1 - Abacaxi (75 cal)");
		System.out.println("2 - Sorvete diet (110 cal)");
		System.out.println("3 - Mouse diet (170 cal)");
		System.out.println("4 - Mouse chocolate (200 cal)");
		System.out.print("Digite o número correspondente à sobremesa: ");
		int escolhaSobremesa = scanner.nextInt();

		System.out.println("Escolha a bebida:");
		System.out.println("1 - Chá (20 cal)");
		System.out.println("2 - Suco de laranja (70 cal)");
		System.out.println("3 - Suco de melão (100 cal)");
		System.out.println("4 - Refrigerante diet (65 cal)");
		System.out.print("Digite o número correspondente à bebida: ");
		int escolhaBebida = scanner.nextInt();

		if (escolhaPrato < 1 || escolhaPrato > 4 || escolhaSobremesa < 1 || escolhaSobremesa > 4 || escolhaBebida < 1
				|| escolhaBebida > 4) {
			System.out.println("Escolha inválida. Por favor, reinicie o programa e insira números válidos.");
		} else {
			// Calcular total de calorias
			int totalCalorias = caloriasPratos[escolhaPrato - 1] + caloriasSobremesas[escolhaSobremesa - 1]
					+ caloriasBebidas[escolhaBebida - 1];

			System.out.println("A quantidade total de calorias da refeição é: " + totalCalorias + " cal");
		}

		scanner.close();
	}

}
