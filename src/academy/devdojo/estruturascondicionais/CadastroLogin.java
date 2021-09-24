package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Permitir que os pr�prios usu�rios cadastrem o nome de usu�rio (login)
 * no sistema, para agilizar o processo de migra��o do sistema antigo para o novo.
 * O usu�rio n�o pode deixar o login vazio "", ou criar um usu�rio com o login
 * "admin" ou "administrador".
 * Se o valor informado for v�lido, o sistema dever� exibir uma mensagem:
 * <Nome do usu�rio> cadastrado com sucesso.
 * Sen�o, o sistema dever� mostrar o erro "Usu�rio inv�lido".
 */
public class CadastroLogin {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome de usu�rio (login):");
		String login = sc.nextLine();
				
		if (login.isBlank() || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
			System.out.println("Usu�rio inv�lido!");
		} else {
			System.out.println(login + " cadastrado com sucesso!");
		}
		
		sc.close();
	}
	
}
