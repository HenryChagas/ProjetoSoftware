package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Tipos Primitivos - int, double, char. --> Lista não trabalha com primitivos.
			//List <char> listaNomes = new Array<>();
		
		//Objetos - String, Integer, Double.
		
		List <String> listaNomes = new ArrayList<>();
		
		//Adicionando itens na última posição do array:
		listaNomes.add("Pedro");
		listaNomes.add("Geovanna");
		listaNomes.add("Luiz");
		listaNomes.add("Kauan");
		
		//Adicionando itens em uma posição do array:
		listaNomes.add(1, "João");
		
		//Verificando o tamanho do Array:
		System.out.println("O tamanho da lista é igual a: " + listaNomes.size());
		
		//Exibindo um valor específico da lista:
		System.out.println("Posição 1: " + listaNomes.get(1));
		
		//Removendo itens de acordo com a posição:
		listaNomes.remove(3);
		
		//Removendo itens de acordo com o valor:
		listaNomes.remove("João");
		
		//indentificando a posição de um elemento:
		System.out.println("A posição de Pedro na lista é: " + listaNomes.indexOf("Pedro"));
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
	}

}
