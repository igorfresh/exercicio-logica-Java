package faccat;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o hor�rio de in�cio da partida: ");
		int inicio = sc.nextInt();
		System.out.println("Digite o hor�rio de t�rmino da partida: ");
		int termino = sc.nextInt();
		int duracao;
		
		if (termino<inicio) {
			duracao = (24 - inicio) + termino;
		} else if (inicio<termino) {
			duracao = termino - inicio; 
		} else {
			duracao = 24;
		}
		
		System.out.println("A dura��o da partida foi de: " + duracao + " horas");
		sc.close();
	}
}
