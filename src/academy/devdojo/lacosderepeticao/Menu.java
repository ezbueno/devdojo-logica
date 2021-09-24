package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Criar um MENU que seja navegável através de números
 * O MENU deve ser exibido da seguinte forma:
 * 1. Calcular imposto
 * 2. Depositar salário
 * 3. Sair
 * O MENU deve ficar disponível enquanto o usuário não digitar o número 3
 * Dessa forma, o sistema ficará em execução, evitando ter que ser reiniciado a cada operação
 */
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

		while (opcao != 3) {
			exibirMenu();			
			System.out.println("Digite a opção desejada:");
			opcao = sc.nextInt();
		}
		System.out.println("Programa encerrado!");
		sc.close();
	}
	
	private static void exibirMenu() {
		System.out.println("========= MENU =========");
		System.out.println("| 1. Calcular imposto  |");
		System.out.println("| 2. Depositar salário |");
		System.out.println("| 3. Sair              |");
		System.out.println("========================");
	}
}
