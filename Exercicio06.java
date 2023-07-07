package faccat;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite a base do retângulo: ");
		float base = leia.nextFloat();
		System.out.println("Digite a altura do retângulo: ");
		float altura = leia.nextFloat();
		float area = base * altura;
		System.out.println("A area do retangulo é: " + area);
		leia.close();
	}
}

// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a
// área do retângulo.