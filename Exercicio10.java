package faccat;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual o custo do carro novo?");
		double custo = sc.nextDouble();
		double valorDistribuidor = (custo*28)/100;
		double valorImposto = (custo*45)/100;
		double resultado = custo + valorDistribuidor + valorImposto; 
		
		System.out.println("O valor do carro será de: " + resultado);
		
		sc.close();
	}

}

// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
// calcular e escrever o custo final ao consumidor.