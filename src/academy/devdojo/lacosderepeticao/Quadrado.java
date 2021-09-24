package academy.devdojo.lacosderepeticao;

/**
 * @author Ezandro Bueno
 * Elaborar um programa que apresente os quadrados dos n�meros inteiros 
 * existentes na faixa de valores de 15 at� 200.
 */
public class Quadrado {

	public static void main(String[] args) {
	
		for (int i = 15; i <= 200; i++) {
			System.out.println("Quadrado do n�mero " + i + " � = " + (i * i));
		}
	}
	
}
