package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e
 * senha corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar o login e a senha,
 * exibir a mensagem ACESSO CONCEDIDO, caso contrário, exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha,
 * essa condição deve-se repetir até que o usuário acerte a combinação.
 */
public class Login {
	
	private static final String LOGIN_AUTENTICACAO = "root";
	private static final String SENHA_AUTENTICACAO = "root";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("====================");
			System.out.println("| ===== LOGIN ==== |");
			System.out.println("====================");
			System.out.println("Informe o login:");
			String loginDigitado = sc.nextLine();
			System.out.println("Informe a senha:");
			String senhaDigitada = sc.nextLine();
			
			if (LOGIN_AUTENTICACAO.equals(loginDigitado) && SENHA_AUTENTICACAO .equals(senhaDigitada)) {
				System.out.println("ACESSO CONCEDIDO");
				break;
			}
			System.out.println("ACESSO NEGADO");
		}
		System.out.println("Programa encerrado!");
		sc.close();
	}
}
