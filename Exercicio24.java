package faccat;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio fixo: ");
		double salarioFixo = sc.nextDouble();
		System.out.println("Insira o valor das vendas efetuadas: ");
		double valorVendas =sc.nextDouble();
		double comissao;
		
		if(valorVendas<1500) {
			comissao = valorVendas * 0.03;
			double salarioTotal = salarioFixo + comissao;
			System.out.println("O salario total do vendedor � de " + salarioTotal);
		}
		else{
			comissao = valorVendas * 0.05;
			double salarioTotal = salarioFixo + comissao;
			System.out.println("O salario total do vendedor � de " + salarioTotal);
		}
		
		
		sc.close();
	}

}
