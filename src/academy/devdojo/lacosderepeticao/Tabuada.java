package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Elaborar um programa que calcule e apresente a tabuada de um número qualquer
 *
 */
public class Tabuada {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = sc.nextInt();
		
		System.out.println("Tabuada do número " + num + ":");
				
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		
		sc.close();
	}	
}
