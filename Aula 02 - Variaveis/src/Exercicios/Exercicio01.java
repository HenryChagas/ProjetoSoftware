package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double celsius;
		System.out.print("Insira uma temperatura em Celsius: ");
		celsius = sc.nextDouble();
		
		double fahrenheit;
		fahrenheit = (celsius * 9/5) + 32;
		
		double kelvin;
		kelvin = celsius + 273.15;
		
		System.out.println();
		System.out.println("Celsius corvertido para Fahrenheit: " + fahrenheit);
		System.out.println("Celsius corvertido para Kelvin: " + kelvin);
		
		sc.close();
	}

}
