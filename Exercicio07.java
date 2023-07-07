package faccat;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		int idadeanos = sc.nextInt();
		System.out.println("Especifique com os meses: ");
		int idademeses = sc.nextInt();
		System.out.println("Especifique com os dias: ");
		int idadedias = sc.nextInt();
		int diasvividos = idadeanos*365 + idademeses*30 + idadedias;
		System.out.println("Total de dias vividos: " + diasvividos);
		
		sc.close();
	}
	
}

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade
// dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.