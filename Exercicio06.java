package faccat;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a base do ret�ngulo: ");
		float base = leia.nextFloat();
		System.out.println("Digite a altura do ret�ngulo: ");
		float altura = leia.nextFloat();
		float area = base * altura;
		System.out.println("A area do retangulo �: " + area);
		leia.close();
	}
}

// Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a
// �rea do ret�ngulo.