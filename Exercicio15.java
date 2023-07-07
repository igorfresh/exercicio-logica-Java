package faccat;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		if (numero>=0) {
			System.out.println("O número digitado é positivo");
		} else if (numero<0) {
			System.out.println("O número digitado é negativo");
		}
		
		sc.close();
	}
}

//Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
