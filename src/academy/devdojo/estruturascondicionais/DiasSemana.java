package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Receba um n�mero inteiro do usu�rio (entre 1 e 7) e imprima o dia da semana correspondente
 */
public class DiasSemana {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero (entre 1 e 7):");
		int dia = sc.nextInt();

		switch (dia) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Ter�a");
		case 4 -> System.out.println("Quarta");
		case 5 -> System.out.println("Quinta");
		case 6 -> System.out.println("Sexta");
		case 7 -> System.out.println("S�bado");
		default -> System.out.println("Valor inv�lido");
		}
		sc.close();
	}

}
