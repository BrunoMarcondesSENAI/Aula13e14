package aula13;

import java.util.Random;
import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Ímpar(1) ou par(2)?");
		int escolha = ler.nextInt();
		int jogada;
		int resultado;
		
		Random random = new Random();
		int sistema = random.nextInt(11);
		
		if (escolha != 1 && escolha != 2) {
			System.out.println("Escolhe certo irmão...");
		}else {
		
		System.out.println("Qual vai ser sua jogada?");
		jogada = ler.nextInt();
		resultado = sistema + jogada;
		
		switch (escolha) {
		case 1:
			if (resultado %2 == 0) {
			System.out.println("Perdeu kk");
			} else {
				System.out.println("Oloco, ganhou :O");
				
			}
			System.out.println("("+resultado+")");
			break;
		case 2: 
			if (resultado %2 == 0) {
				System.out.println("Oloco, ganhou :O");
				} else {
					System.out.println("Perdeu kk");
				}
			System.out.println("("+resultado+")");
			break;
		}ler.close();
	}
	}
}
