package aula14;

import java.util.Scanner;

public class somaDeVetores {
	
	public static void main(String[] args) {
		
//		DECLARAÇÃO VETORES
		int vetorA[]=new int[5];
		int vetorB[]=new int[5];
		int vetorC[]=new int[10];
		
//		DECLARAÇÃO SCANNER
		Scanner ler = new Scanner(System.in);
		
//		ENTRADA DOS NUMEROS "A"
		for (int i =0; i<5; i++) {
		System.out.println("Informe um valor "+i+"A..:");
		vetorA[i]=ler.nextInt();
		}
		
//		ENTRADA DOS NÚMEROS "B"
		for (int i =0; i<5; i++) {
		System.out.println("Informe um valor "+i+"B..:");
		vetorB[i]=ler.nextInt();
		}
		
//		SOMA DOS VETORES
		for (int i=0;i<5;i++) {
			vetorC[i] = vetorA[i];
			vetorC[i+5]=vetorB[i];
		}

//		SAÍDA
		System.out.println("A soma dos vetores A e B foi: ");
		for (int i =0; i<10; i++) {
			System.out.print(vetorC[i] + " ");
		}
		ler.close();
	}

}
