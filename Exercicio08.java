package faccat;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero de eleitores no munic�pio: ");
		int eleitores = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos v�lidos");
		int validos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos");
		int nulos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos brancos: ");
		int brancos = sc.nextInt();
		
		double percentualValidos = 100*validos/eleitores;
		double percentualNulos = 100*nulos/eleitores;
		double percentualBrancos = 100*brancos/eleitores;
		
		System.out.println("De " + eleitores + "  eleitores a porcentagem de votos v�lidos, nulos e brancos �: ");
		System.out.println("V�lidos: " + percentualValidos + "%");
		System.out.println("Nulos: " + percentualNulos + "%");
		System.out.println("Brancos: " + percentualBrancos + "%");
		
		
		sc.close();
	}
}

// Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos
// brancos, nulos e v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total
// de eleitores.
