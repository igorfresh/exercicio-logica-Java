package faccat;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		double tempF = sc.nextDouble();
		double tempC = (5*tempF - 160) / 9;
		System.out.println("A temperatura em graus Celsius é de: " + tempC + "°");
		
		sc.close();
	}
}

// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
// correspondente em graus Celsius