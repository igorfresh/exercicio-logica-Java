package faccat;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		System.out.println("Digite um valor: ");
		Scanner leia = new Scanner (System.in);
		int valor = leia.nextInt();
		int antecessor = valor - 1;
		System.out.println("O antecessor do valor é: " + antecessor);
		leia.close();
	}
}

// Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.