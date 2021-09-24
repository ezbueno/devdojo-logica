package academy.devdojo.arrays;

/**
 * @author Ezandro Bueno
 * Armazenar em dois vetores V1 e V2, 9 valores numéricos inteiros
 * e exibir o resultado da multiplicação dos números do V1 correspondentes em V2.
 */
public class Multiplicacao {

	public static void main(String[] args) {
		final int tamanho = 9;
		
		int[] v1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] v2 = { 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int[] vr = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			vr[i] = v1[i] * v2[i];
			System.out.println("v1 * v2 -> posição " + (i + 1) + " = " + vr[i]);
		}
	}
	
}
