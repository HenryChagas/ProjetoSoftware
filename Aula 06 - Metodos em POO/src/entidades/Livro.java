package entidades;

public class Livro {
	
	//Atributos
	public String livro;
	public String autor;
	public int quantidade;
	public double valorUnit;
	
	//Metodos Str / int / double / etc...
	public String exibeInfo() {
		
		return "Livro: " + livro + 
				"\nAutor: " + autor +
				"\nQuantidade: " + quantidade +
				"\nValor Unitário: " + valorUnit +
				"\nValor Total: " + valorTotal();
		
	}
	
	//Metodos Void
	public void emprestaLivro(int quantidade) {
		this.quantidade -= quantidade;
	}	
	
	public void devolveLivro(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public double valorTotal() {
		double valorTotalLivros = quantidade * valorUnit;
		return valorTotalLivros;
	}
}
