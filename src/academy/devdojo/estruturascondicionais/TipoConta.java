package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Informar o tipo de conta e o sistema deve imprimir qual a porcentagem de juros
 * que aquela conta irá oferecer.
 * Os tipos são:
 * CONTA POUPANÇA - 0.05%
 * CONTA CORRENTE - 0.02%
 * CONTA INVESTIMENTO - 0.1%
 * Caso a conta não exista, imprima CONTA INEXISTENTE
 */
public class TipoConta {

	public static void main(String[] args) {
		System.out.println("| ======================= |");
		System.out.println("| Escolha o tipo de conta |");
		System.out.println("| ======================= |");
		System.out.println("| 1 - CONTA POUPANÇA      |");
		System.out.println("| 2 - CONTA CORRENTE      |");
		System.out.println("| 3 - CONTA INVESTIMENTO  |");
		System.out.println("| ======================= |");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tipo de conta:");
		int tipo = sc.nextInt();
		
		switch(tipo) {
		case 1 -> System.out.println("0.05%");
		case 2 -> System.out.println("0.02%");
		case 3 -> System.out.println("0.1%");
		default -> System.out.println("CONTA INEXISTENTE");
		}
		sc.close();
	}
	
}
