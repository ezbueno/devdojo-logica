package academy.devdojo.variaveis;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Informe um nome e uma idade via teclado
 * Imprima os dados
 */
public class RecebeDadosTeclado {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		String nome = sc.next();
		
		System.out.println("Digite a idade:");
		int idade = sc.nextInt(); 
		
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitada foi: " + idade);
		
		sc.close();
	}
}
