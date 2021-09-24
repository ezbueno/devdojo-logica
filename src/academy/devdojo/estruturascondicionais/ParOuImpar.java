package academy.devdojo.estruturascondicionais;

/**
 * @author Ezandro Bueno
 * Dado um valor, informe se é par ou ímpar
 */
public class ParOuImpar {

	public static void main(String[] args) {
		int numero = 8;

		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}
	}

}
