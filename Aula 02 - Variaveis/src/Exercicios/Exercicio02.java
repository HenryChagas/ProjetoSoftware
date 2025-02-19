package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua Capital Inicial: ");
		float capitalInicial = sc.nextFloat();
		System.out.println();
		
		System.out.print("Digite a taxa de juros: ");
		float taxaJuros = sc.nextFloat();
		System.out.println();
		
		System.out.print("Digite o número de meses: ");
		int numMeses = sc.nextInt();
		System.out.println();
		
		double potencia = Math.pow(taxaJuros , numMeses);	
		double montanteTotal = capitalInicial * (1 + taxaJuros) * potencia;
		System.out.println("O montante total é: " + montanteTotal);
		sc.close();
		
	}

}
