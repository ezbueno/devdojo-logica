package academy.devdojo.variaveis;

/**
 * @author Ezandro Bueno
 * Calcule uma determinada porcentagem de um dado sal�rio
 * Definir o valor da porcentagem
 * Calcule a porcentagem
 */

public class CalculadoraImposto {
	
	public static void main(String[] args) {
		float salario = 2500.00F;
		float porcentagem = 30L;
		float porcentagemSalario = salario * (porcentagem / 100);
		
		System.out.println("A porcentagem do sal�rio � = " + porcentagemSalario);
	}

}
