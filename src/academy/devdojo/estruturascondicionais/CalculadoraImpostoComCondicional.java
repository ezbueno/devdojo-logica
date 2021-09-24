package academy.devdojo.estruturascondicionais;

/**
 * @author Ezandro Bueno
 * Dado um determinado sal�rio
 * Se o sal�rio for maior que 4500, imprima 30% do valor 
 * Sen�o, imprima 15% do valor
 * Utilize apenas uma vari�vel para guardar o resultado e imprimir no final 
 * Informe na impress�o se � 30% ou 15%
 */
public class CalculadoraImpostoComCondicional {

	public static void main(String[] args) {
		float salario = 4700.50F;
		float resultado = 0;
		String porcentagem = "";

		if (salario > 4500.00F) {
			resultado = salario * 0.3F;
			porcentagem = "30%";
		} else {
			resultado = salario * 0.15F;
			porcentagem = "15%";
		}
		System.out.println("O valor final em porcentagem de " + porcentagem + " � de " + resultado);
	}
}
