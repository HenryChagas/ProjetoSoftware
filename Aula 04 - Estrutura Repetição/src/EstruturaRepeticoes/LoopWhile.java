package EstruturaRepeticoes;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// Login e Senha
		// Limitar o número de tentativas - 5
		Scanner sc = new Scanner(System.in);
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		String login = "";
		String senha = "";
		int tentativas = 1;
		int maxTentativas = 5;
	
			
		while (true) {
				
			System.out.print("Digite seu login: ");
			login = sc.nextLine();
			
			System.out.print("Digite seu senha: ");
			senha = sc.nextLine();
				
			if (login.equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso liberado");
				break;
			}
			else if (tentativas >= maxTentativas) {
				System.out.println("Número máximo de tentativas excedido, acesso bloqueado");
				break;
			}
			else {
				tentativas++;
				System.out.println("Acesso negado, tente novamente");
				
			}

			}

	}

}
