package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Progam {

	public static void main(String[] args) {
		Conta conta;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Digite aqui o numero da sua conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite aqui o seu usuário: ");
		sc.nextLine();
		String usuario = sc.nextLine();
		System.out.print("Gostaria de fazer um depósito inicial (s/n) ");
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.println("Enter initial deposit value ");
			double depositoInicial = sc.nextDouble();
		conta = new Conta(numero, usuario, depositoInicial);
		}
		else {
			conta = new Conta(numero, usuario);
		}
		 System.out.println();
		 System.out.println("Dados da conta: ");
		 System.out.println(conta);
		 
		 System.out.println();
		 System.out.print("Digite o valor do depósito: ");
		 double  depositoValor = sc.nextDouble();
		 conta.deposit(depositoValor);
		 System.out.println("Atualizar dados da conta: ");
		 System.out.println(conta);
		 
		 System.out.println();
		 System.out.print("Digite aqui o valor do seu saque: ");
		 double saqueValor = sc.nextDouble();
		 conta.whitdraw(saqueValor);
		 System.out.println("Updated account data: ");
		 System.out.println(conta);
		 
		sc.close();

	}

}
