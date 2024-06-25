package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			
			//RECEBENDO O NOME DO CLIENTE			
			System.out.println("Por favor, informe seu nome!");
			String nomeCliente = scanner.nextLine();
			System.out.printf("Olá, %s", nomeCliente);
			
			//RECEBENDO O NUMERO DA CONTA DO CLIENTE			
			System.out.println(" Por favor, informe sua Conta!");
			int Conta = scanner.nextInt();
			scanner.nextLine();
			
			//RECEBENDO O NUMERO DA AGENCIA DO CLIENTE
			System.out.println("Por favor, informe sua Agencia!");
			String Agencia = scanner.nextLine();
			
			//RECEBENDO O SALDO DO CLIENTE
			System.out.println("Por favor, Preencha seu saldo!");
			double saldo = scanner.nextDouble();
			
			//RETORNANDO O VALOR FINAL
			System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " , conta " + Conta + " e seu saldo " + saldo +  " já está disponível para saque!");
			
			
		}

}
