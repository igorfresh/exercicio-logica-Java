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
		
		System.out.println("O valor do carro ser� de: " + resultado);
		
		sc.close();
	}

}

// O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do
// distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor
// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de f�brica de um carro,
// calcular e escrever o custo final ao consumidor.