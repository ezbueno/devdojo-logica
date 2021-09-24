package academy.devdojo.lacosderepeticao;

/**
 * @author Ezandro Bueno
 * Elaborar um programa que apresente no final o somatório dos valores pares
 * existentes na faixa de 1 até 500
 *
 */
public class Somatorio {

	public static void main(String[] args) {

		int soma = 0;

		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				soma += i;
			}
		}

		System.out.println("Resultado da soma dos números pares = " + soma);

	}

}
