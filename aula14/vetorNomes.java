package aula14;

import java.util.Scanner;

public class vetorNomes {
	
	public static void main(String[] args) {

//		DECLARAÇÃO DO VETOR
		String nome[] = new String[5];

//		DECLARAÇÃO DO SCANNER
		Scanner ler = new Scanner(System.in);

//		TERNÁRIO PARA PEDIR NOMES
		for (int i=0;i<5;i++) {
			System.out.println("informe um nome "+i+"..:");
			nome[i]=ler.next();
		}
//		ESPAÇO, TERNÁRIO PARA EXIBIR NOMES
		System.out.println("");
		for (int i=0;i<5;i++) {
			System.out.println(nome[i]);
		}
		ler.close();
	}

}