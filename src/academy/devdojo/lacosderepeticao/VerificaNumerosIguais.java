package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

public class VerificaNumerosIguais {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean desejaContinuar = true;
		
		do {
			System.out.println("PLAYER 1: Digite um n�mero de 1 a 10");
			int num1 = sc.nextInt();
			
			System.out.println("PLAYER 2: Digite um n�mero de 1 a 10");
			int num2 = sc.nextInt();
			
			if (num1 == num2) {
				System.out.println("ACERTOU!!! Os n�meros digitados s�o iguais!");
			} else {
				System.out.println("ERROU!!! Os n�meros digitados n�o s�o iguais!");
			}
			
			System.out.println("Deseja continuar? S/N");
			String escolha = sc.next();
			
			if (!escolha.equalsIgnoreCase("S")) {
				desejaContinuar = false;
			}
			
		} while (desejaContinuar);
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
