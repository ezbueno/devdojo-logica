package academy.devdojo.lacosderepeticao;

/**
 * @author Ezandro Bueno
 * Exibir a tabuada do 1 a 10
 *
 */
public class TabuadaCompleta {

	public static void main(String[] args) {
		int num = 1;
		
		while (num <= 10) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}
			System.out.println("==================");
			num++;
		}
		
	}

}
