package faccat;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		System.out.println("Digite seu ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		
		if(idade>16) {
			System.out.println("Voc� pode votar.");
		} else {
			System.out.println("Voc� n�o pode votar.");
		}
		
		sc.close();

	}

}

/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poder� ou n�o votar este ano (n�o � necess�rio considerar o m�s em que a pessoa nasceu). */
