package estruturada;

public class ContaMes {

	public static void main(String[] args) {
		
		double janAlim, janAgua, janLuz, fevAlim, fevAgua, fevLuz;
		
		//Gastos Janeiro
		janAlim = 1000;
		janAgua = 300;
		janLuz = 300;
		
		//Gastos Fevereiro
		fevAlim = 1500;
		fevAgua = 300;
		fevLuz = 300;
		
		//Gasto Total
		double gastoTotalJan = janAlim + janAgua + janLuz;
		double gastoTotalFev = fevAlim + fevAgua + fevLuz;
		
		if (gastoTotalJan > gastoTotalFev) {
			System.out.println("O gasto de Janeiro foi maior");
		}
		
		else if (gastoTotalFev > gastoTotalJan) {
			System.out.println("O gasto de Fevereiro foi maior");
		} 
		
		else {
			System.out.println("Ambos os meses tiveram o mesmo gastos");
		}

	}

}
