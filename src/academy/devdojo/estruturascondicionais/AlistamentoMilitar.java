package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Processo de alistamento militar
 * O sistema deve aceitar os seguintes par�metros:
 * Sexo, sendo v�lido apenas M ou F e idade
 * Se o sexo for Masculino e a idade for maior ou igual a 18, o sistema deve imprimir 'Alistamento obrigat�rio'
 * Se o sexo for Masculino e a idade for menor que 18, o sistema deve imprimir 'Alistamento n�o permitido'
 * Se o sexo for Feminino e a idade for maior ou igual a 18, o sistema deve perguntar se a pessoa deseja se alistar
 * Se o sexo for Feminino e a idade for menor que 18, o sistema deve imprimir 'Alistamento n�o permitido'
 */
public class AlistamentoMilitar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o sexo:");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Informe a idade:");
		int idade = sc.nextInt();
		
		if ((sexo == 'M' || sexo == 'F') && idade < 18) {
			System.out.println("Alistamento n�o permitido");
		} else if (sexo =='M' && idade >= 18) {
			System.out.println("Alistamento obrigat�rio");
		} else if (sexo == 'F' && idade >= 18) {
			System.out.println("Deseja se alistar?");
		}
		sc.close();
	}

}
