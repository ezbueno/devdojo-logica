package academy.devdojo.estruturascondicionais;

/**
 * @author Ezandro Bueno
 * Dado um valor, informe se � par ou �mpar
 */
public class ParOuImpar {

	public static void main(String[] args) {
		int numero = 8;

		if (numero % 2 == 0) {
			System.out.println("O n�mero � par!");
		} else {
			System.out.println("O n�mero � �mpar!");
		}
	}

}
