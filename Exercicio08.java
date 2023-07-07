package faccat;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de eleitores no município: ");
		int eleitores = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos válidos");
		int validos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos");
		int nulos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos brancos: ");
		int brancos = sc.nextInt();
		
		double percentualValidos = 100*validos/eleitores;
		double percentualNulos = 100*nulos/eleitores;
		double percentualBrancos = 100*brancos/eleitores;
		
		System.out.println("De " + eleitores + "  eleitores a porcentagem de votos válidos, nulos e brancos é: ");
		System.out.println("Válidos: " + percentualValidos + "%");
		System.out.println("Nulos: " + percentualNulos + "%");
		System.out.println("Brancos: " + percentualBrancos + "%");
		
		
		sc.close();
	}
}

// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
// brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
// de eleitores.
