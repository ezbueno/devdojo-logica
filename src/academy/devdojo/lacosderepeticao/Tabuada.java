package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Elaborar um programa que calcule e apresente a tabuada de um n�mero qualquer
 *
 */
public class Tabuada {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num = sc.nextInt();
		
		System.out.println("Tabuada do n�mero " + num + ":");
				
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		sc.close();
	}	
}
