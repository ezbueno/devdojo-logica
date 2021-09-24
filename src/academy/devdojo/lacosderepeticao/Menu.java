package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Criar um MENU que seja naveg�vel atrav�s de n�meros
 * O MENU deve ser exibido da seguinte forma:
 * 1. Calcular imposto
 * 2. Depositar sal�rio
 * 3. Sair
 * O MENU deve ficar dispon�vel enquanto o usu�rio n�o digitar o n�mero 3
 * Dessa forma, o sistema ficar� em execu��o, evitando ter que ser reiniciado a cada opera��o
 */
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 3) {
			exibirMenu();			
			System.out.println("Digite a op��o desejada:");
			opcao = sc.nextInt();
		}
		System.out.println("Programa encerrado!");
		sc.close();
	}
	
	private static void exibirMenu() {
		System.out.println("========= MENU =========");
		System.out.println("| 1. Calcular imposto  |");
		System.out.println("| 2. Depositar sal�rio |");
		System.out.println("| 3. Sair              |");
		System.out.println("========================");
	}
}
