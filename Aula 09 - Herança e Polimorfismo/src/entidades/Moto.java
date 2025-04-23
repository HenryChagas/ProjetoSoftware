package entidades;

public class Moto extends Veiculos{
	//Encapsulmento
	//Atributos
	private int cilindradas;
	
	//Construtor
	public Moto(String marca, String modelo, int ano, double valorDiario, int cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Marca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nAno: " + getAno() +
				"\nValor Diaria:" + getValorDiario() +
				"\nCilindradas: " + cilindradas;
	}
	
}
