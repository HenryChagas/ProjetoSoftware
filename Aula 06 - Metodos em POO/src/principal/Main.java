package principal;

import java.util.Scanner;
	
import entidades.Livro;

public class Main {

	public static void main(String[] args) {
		
		Livro culpaDasEstrelas = new Livro();
		Scanner sc = new Scanner(System.in);
		
		culpaDasEstrelas.livro = "A culpa é das estrelas";
		culpaDasEstrelas.autor = "John Green";
		culpaDasEstrelas.quantidade = 100;
		culpaDasEstrelas.valorUnit = 80;
		System.out.println(culpaDasEstrelas.exibeInfo());
		
		System.out.print("informe a quantidade de livros emprestados: ");
		int quantidade = sc.nextInt();
		culpaDasEstrelas.emprestaLivro(quantidade);
		
		System.out.print("informe a quantidade de livros devolvidos: ");
		quantidade = sc.nextInt();
		culpaDasEstrelas.devolveLivro(quantidade);
		
		System.out.println("Dados Atualizados: " + culpaDasEstrelas.exibeInfo());
		sc.close();
			
		
		
		
		Livro bíblia = new Livro();
		
		bíblia.livro = "Bíblia";
		bíblia.autor = "Espírito Santo";
		bíblia.quantidade = 100;
		bíblia.valorUnit = 79;
		
		bíblia.emprestaLivro(10);
		bíblia.devolveLivro(5);
		
		System.out.println(bíblia.exibeInfo());
		
	}

}
