package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Permitir que os próprios usuários cadastrem o nome de usuário (login)
 * no sistema, para agilizar o processo de migração do sistema antigo para o novo.
 * O usuário não pode deixar o login vazio "", ou criar um usuário com o login
 * "admin" ou "administrador".
 * Se o valor informado for válido, o sistema deverá exibir uma mensagem:
 * <Nome do usuário> cadastrado com sucesso.
 * Senão, o sistema deverá mostrar o erro "Usuário inválido".
 */
public class CadastroLogin {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome de usuário (login):");
		String login = sc.nextLine();
				
		if (login.isBlank() || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")) {
			System.out.println("Usuário inválido!");
		} else {
			System.out.println(login + " cadastrado com sucesso!");
		}
		
		sc.close();
	}
	
}
