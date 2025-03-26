package poo;

public class Principal {

	public static void main(String[] args) {
		
		ContaMes janerio = new ContaMes();
		ContaMes fevereiro = new ContaMes();
		
		//Gasto Janeiro
		janerio.alimentacao = 1000;
		janerio.agua = 300;
		janerio.luz = 300;
		
		//Gasto Fevereiro
		fevereiro.alimentacao = 1000;
		fevereiro.agua = 300;
		fevereiro.luz = 300;
		
		//Gasto Total
		double gastoJan = janerio.somaGasto() ;
	    double gastoFev = fevereiro.somaGasto();
	    
	    if (gastoJan > gastoFev) {
			System.out.println("O gasto em Janeiro foi maior");
		}
	    
	    else if (gastoFev > gastoJan) {
			System.out.println("O gasto em Fevereiro foi maior");
		}
	    
	    else {
	    	System.out.println("Ambos os meses tiveram o mesmo gasto");
	    }
	}

}
