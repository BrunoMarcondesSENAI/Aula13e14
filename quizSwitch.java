package aula13;

import java.util.Scanner;

public class quizSwitch {
	
	public static void main(String[] args) {
		
	
	Scanner ler = new Scanner(System.in);
	int pontuacao = 0;
	int resposta;

	System.out.println("Mini Quiz!");

	System.out.println("Qual a capital do Brasil?\n1. Rio\n2. SP\n3. Brasília");
	System.out.print("Sua resposta: ");
	resposta = ler.nextInt();
	switch (resposta) {
	case 3:
	pontuacao++;
	break;
	}


	System.out.println("\nQuem pintou a Mona Lisa?\n1. Michel\n2. Vinci\n3. Rafael");
	System.out.print("Sua resposta: ");
	resposta = ler.nextInt();
	switch (resposta) {
	case 2:
	pontuacao++;
	break;
	}

	System.out.println("\nMaior planeta?\n1. Marte\n2. Júpiter\n3. Saturno");
	System.out.print("Sua resposta: ");
	resposta = ler.nextInt();
	switch (resposta) {
	case 2:
	pontuacao++;
	break;
	}

	System.out.println("\nSua pontuação: " + pontuacao + " de 3.");
	ler.close();
}


}
