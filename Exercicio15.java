package faccat;

import java.util.Scanner;

public class Exercicio15 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		if (numero>=0) {
			System.out.println("O n�mero digitado � positivo");
		} else if (numero<0) {
			System.out.println("O n�mero digitado � negativo");
		}
		
		sc.close();
	}
}

//Ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo).
