package EstruturaRepeticoes;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		// Tabuada
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero= sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "*" + i + "=" + numero*i);
		}
		
		sc.close();

	}

}
