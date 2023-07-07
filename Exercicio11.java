package faccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos carros foram vendidos?");
		int carrosVendidos = sc.nextInt();
		System.out.println("Qual o valor total de vendas?");
		double valorVendas = sc.nextDouble();
		System.out.println("Qual o valor de comiss�o por cada carro vendido?");
		double comissaoFixa = sc.nextDouble();
		System.out.println("Qual o sal�rio fixo do funcion�rio?");
		double salario = sc.nextDouble();
		
		double salarioFinal = carrosVendidos*comissaoFixa + valorVendas*0.05 + salario;
		System.out.println("O sal�rio final do vendedor �: " + salarioFinal);
		
		sc.close();

	}
}

// Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s,
// mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele
// efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas
// vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do vendedor.