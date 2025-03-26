package exemplo;

public class Principal {

	public static void main(String[] args) {
		
		Carro civic = new Carro();
		
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.motor = 2.0;
		civic.placa = "EIC-2490";
		civic.cor = "Preta";
		civic.ano = 2024;
		civic.velocidade = 0;
		civic.acelera(10);
		civic.acelera(20);
		civic.freia(5);
		civic.exibirInfo();
		
		Carro corolla = new Carro();
		
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.motor = 2.0;
		corolla.placa = "EUC-2015";
		corolla.cor = "Prata";
		corolla.ano = 2023;
		corolla.velocidade = 0;
		corolla.acelera(10);
		corolla.acelera(30);
		corolla.freia(10);
		corolla.exibirInfo();
		
		Carro hb20 = new Carro();
		
		hb20.fabricante = "Hyundai";
		hb20.modelo = "Hb20";
		hb20.motor = 1.0;
		hb20.placa = "SFG-6897";
		hb20.cor = "Branca";
		hb20.ano = 2024;
		hb20.velocidade = 0;
		hb20.acelera(10);
		hb20.acelera(100);
		hb20.freia(50);
		hb20.exibirInfo();
		
	}

}
