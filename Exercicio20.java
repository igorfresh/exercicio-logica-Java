package faccat;

import java.util.Scanner;

public class Exercicio20 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero1 = sc.nextDouble();
		System.out.println("Digite outro n�mero: ");
		double numero2 = sc.nextDouble();
		
		if(numero1>numero2) {
			System.out.println("Ordem crescente: " + numero2 + ", " + numero1);
		} else if (numero2>numero1) {
			System.out.println("Ordem crescente: " + numero1 + ", " + numero2);
		} else {
			System.out.println("Os valores n�o podem ser iguais, tente novamente");
		}
		
		sc.close();
	}
}
