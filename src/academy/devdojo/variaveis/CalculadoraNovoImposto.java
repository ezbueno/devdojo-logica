package academy.devdojo.variaveis;

/**
 * @author Ezandro Bueno
 * Crie uma vari�vel que ir� guardar o valor de um sal�rio
 * Calcule a porcentagem desse sal�rio, sendo os valores da porcentagem:
 * 30%
 * 15%
 * 5%
 * A cada vez que voc� calcular, guarde o resultado em uma vari�vel
 * Imprima o resultado e reutilize a vari�vel que guarda o resultado para o novo c�lculo
 */

public class CalculadoraNovoImposto {
	
	public static void main(String[] args) {
		double salario = 5000.00;
		
		double resultado = salario * 0.3;
		System.out.println("A porcentagem de 30% do sal�rio � = " + resultado);
		
		resultado = salario * 0.15;
		System.out.println("A porcentagem de 15% do sal�rio � = " + resultado);
		
		resultado = salario * 0.05;
		System.out.println("A porcentagem de 5% do sal�rio � = " + resultado);
	}

}
