package aula13;

import java.util.Scanner;

public class caixaEletronico {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double saldo = 0;
		int opcao;

		while (true) {
		System.out.println("\nCaixa Eletrônico:");
		System.out.println("1. Saldo\n2. Depositar\n3. Sacar\n4. Sair");
		System.out.print("Opção: ");
		opcao = ler.nextInt();

		switch (opcao) {
		case 1:
		System.out.println("Saldo: R$" + saldo);
		break;
		case 2:
		System.out.print("Depositar: R$");
		double deposito = ler.nextDouble();
		if (deposito > 0) saldo += deposito;
		else System.out.println("Inválido.");
		break;
		case 3:
		System.out.print("Sacar: R$");
		double saque = ler.nextDouble();
		if (saque > 0 && saque <= saldo) saldo -= saque;
		else System.out.println("Inválido/Saldo insuficiente.");
		break;
		case 4:
		System.out.println("Obrigado!");
		return;
		default:
		System.out.println("Opção inválida.");
		ler.close();
		}
		}
		}
		
	}


