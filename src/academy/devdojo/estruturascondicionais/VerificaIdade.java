package academy.devdojo.estruturascondicionais;

/**
 * @author Ezandro Bueno
 * Receba uma idade como entrada
 * Se a idade for maior que 18, imprima 'Adulto'
 * Sen�o, imprima 'Ainda n�o � Adulto'
 */
public class VerificaIdade {

	public static void main(String[] args) {
		int idade = 20;

		if (idade > 18) {
			System.out.println("Adulto");
		} else {
			System.out.println("Ainda n�o � adulto");
		}
	}

}
