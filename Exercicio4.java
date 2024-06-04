package ListasExercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4- Dados três valores A, B e C, construa um programa em JAVA, que imprima os
		 * valores de forma descendente (do maior para o menor).
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor de A: ");
		int A = scanner.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = scanner.nextInt();
		System.out.print("Digite o valor de C: ");
		int C = scanner.nextInt();

		int maior, meio, menor;

		if (A >= B && A >= C) {
			maior = A;
			if (B >= C) {
				meio = B;
				menor = C;
			} else {
				meio = C;
				menor = B;
			}
		} else if (B >= A && B >= C) {
			maior = B;
			if (A >= C) {
				meio = A;
				menor = C;
			} else {
				meio = C;
				menor = A;
			}
		} else {
			maior = C;
			if (A >= B) {
				meio = A;
				menor = B;
			} else {
				meio = B;
				menor = A;
			}
		}

		System.out.println("Valores em ordem descendente: " + maior + ", " + meio + ", " + menor);

		scanner.close();
	}

}
