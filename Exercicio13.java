package faccat;

import java.util.Scanner;

public class Exercicio13 {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		double n3 = sc.nextDouble();
		
		double mediafinal = (n1*2 + n2*3 + n3*5) / 10;
		System.out.println("A média final do aluno é de: " + mediafinal);
		sc.close();
		
	}
}

// Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
// Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5