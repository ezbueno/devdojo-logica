package academy.devdojo.lacosderepeticao;

/**
 * @author Ezandro Bueno
 * Elaborar um programa que apresente os quadrados dos números inteiros 
 * existentes na faixa de valores de 15 até 200.
 */
public class Quadrado {

	public static void main(String[] args) {
	
		for (int i = 15; i <= 200; i++) {
			System.out.println("Quadrado do número " + i + " é = " + (i * i));
		}
	}
	
}
