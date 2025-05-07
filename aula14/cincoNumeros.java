package aula14;

import java.util.Scanner;

public class cincoNumeros {
	
	public static void main(String[] args) {
		
//		DECLARAÇÃO DO VETOR
		int numeros[]=new int[5];
		
//		DECLARAÇÃO DO SCANNER
		Scanner ler = new Scanner(System.in);
		
//		TERNÁRIO PARA NÚMEROS
		for (int i=0;i<5;i++) {
			System.out.println("Informe um número "+i+"..:");
			numeros[i]=ler.nextInt();
		}
//		SOMA DO VETOR
		int soma= numeros[0]+numeros[2]+numeros[3]+numeros[4]+numeros[1];
		
//		MAIOR QUE 30 MOSTRAR
		if (soma>30) { System.out.println("A soma dos números foi: "+soma);
		}
//		MENOR QUE TRINTA FALAR...
		else {System.out.println("A soma foi menor que 30");
		}
		ler.close();
	}

}
