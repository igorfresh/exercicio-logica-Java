package faccat;

import java.util.Scanner;

public class Exercicio16 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma��s foram compradas? ");
		int quantidadeMa�as = sc.nextInt();
		double precoTotal;
		if (quantidadeMa�as>=12) {
			precoTotal = quantidadeMa�as*1;
		} else {
			precoTotal = quantidadeMa�as*1.30;
		}
		
		System.out.println("Foram compradas " + quantidadeMa�as + " ma��s, totalizando o pre�o de: " + precoTotal + " R$");
		
		
		sc.close();
	}
}


/* As ma��s custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o n�mero de ma��s compradas, calcule e
escreva o custo total da compra. */
