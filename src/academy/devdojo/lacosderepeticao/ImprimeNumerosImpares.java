package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno 
 * Imprimir todos os n�meros �mpares de 0 at� o valor digitado pelo usu�rio
 */
public class ImprimeNumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero:");
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
