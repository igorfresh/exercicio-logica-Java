package faccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maçãs foram compradas? ");
		int quantidadeMaças = sc.nextInt();
		double precoTotal;
		if (quantidadeMaças>=12) {
			precoTotal = quantidadeMaças*1;
		} else {
			precoTotal = quantidadeMaças*1.30;
		}
		
		System.out.println("Foram compradas " + quantidadeMaças + " maçãs, totalizando o preço de: " + precoTotal + " R$");
		
		
		sc.close();
	}
}


/* As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra. */
