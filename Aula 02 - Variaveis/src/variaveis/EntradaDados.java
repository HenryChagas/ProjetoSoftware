package variaveis;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Você digitou: " + nome);
		
		System.out.println();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println("Você digitou: " + idade);
		
		System.out.println();
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Você digitou " + altura);
		
		sc.close();
	}

}
