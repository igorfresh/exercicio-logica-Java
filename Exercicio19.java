package faccat;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float valor1 = sc.nextFloat();
		System.out.println("Digite outro valor: ");
		float valor2 = sc.nextFloat();
		
		if (valor1>valor2) {
			System.out.println("O valor maior é o " + valor1);
		} else if (valor2>valor1) {
			System.out.println("O valor maior é o " + valor2);
		} else {
			System.out.println("Os valores são inválidos");
		}
		
		sc.close();

	}

}
