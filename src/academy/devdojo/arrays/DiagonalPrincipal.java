package academy.devdojo.arrays;

/**
 * @author Ezandro Bueno
 * Calcule a multiplicação dos elementos da diagonal principal de uma matriz quadrada
 */
public class DiagonalPrincipal {

	public static void main(String[] args) {
		int[][] matriz = {{2, 4, 1}, {6, 9, 7}, {4, 2, 6}};
		int resultado = 1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {				
				if (i == j) {
					resultado *= matriz[i][j];
				}
			}
		}
		System.out.println("Resultado da multiplicação dos valores da diagonal principal = " + resultado);
	}

}
