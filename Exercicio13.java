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
		System.out.println("A m�dia final do aluno � de: " + mediafinal);
		sc.close();
		
	}
}

// Fa�a um algoritmo que leia tr�s notas de um aluno, calcule e escreva a m�dia final deste aluno.
// Considerar que a m�dia � ponderada e que o peso das notas � 2, 3 e 5