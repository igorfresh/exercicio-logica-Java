package faccat;

import java.util.Scanner;

public class Exercicio17 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) /2;
		
		if (media>=6) {
			System.out.println("O aluno foi aprovado, com a m�dia de " + media);
		} else {
			System.out.println("O aluno n�o foi aprovado, com a m�dia de " + media);
		}
		
		sc.close();
	}
}


/*Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica simples e escrever
uma mensagem que diga se o aluno foi ou n�o aprovado (considerar que nota igual ou maior que 6 o
aluno � aprovado). Escrever tamb�m a m�dia calculada. */
