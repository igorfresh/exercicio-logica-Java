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
			System.out.println("O aluno foi aprovado, com a média de " + media);
		} else {
			System.out.println("O aluno não foi aprovado, com a média de " + media);
		}
		
		sc.close();
	}
}


/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada. */
