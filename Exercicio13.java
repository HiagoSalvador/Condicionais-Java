package ListasExercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/* 13- Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
		 *  A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius. 
		 */
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();

	}

}
