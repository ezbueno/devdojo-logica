package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/**
 * @author Ezandro Bueno
 * Nome e a idade dos participantes de um torneio de natação
 * O sistema deve imprimir da seguinte forma:
 * Menor que 10 anos: <Nome> participará da categoria infantil
 * Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
 * Entre 16 e 19 anos: <Nome> participará da categoria Pré-adulto
 * Acima de 20 anos: <Nome> participará da categoria Adulto
 */
public class TorneioNatacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		String nome = sc.next();
		
		System.out.println("Digite a idade:");
		int idade = sc.nextInt();
		
		if (idade <= 10) {
			System.out.println(nome + " participará da categoria infantil");
		} else if (idade >= 11 && idade <=15) {
			System.out.println(nome + " participará da categoria juvenil");
		} else if (idade >=16 && idade <= 19) {
			System.out.println(nome + " participará da categoria Pré-adulto");
		} else {
			System.out.println(nome + " participará da categoria Adulto");
		}
		sc.close();
	}

}
