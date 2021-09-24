package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno 
 * Imprimir todos os números ímpares de 0 até o valor digitado pelo usuário
 */
public class ImprimeNumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		int i = 0;

		while (i <= numero) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		sc.close();
	}

}
