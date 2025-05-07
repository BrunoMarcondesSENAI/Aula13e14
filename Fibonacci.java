package aula13;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número N para ver os N primeiros termos da sequência de Fibonacci:");
		int n = ler.nextInt();

		if (n <= 0) {
		System.out.println("Digite um número positivo.");
		} else if (n == 1) {
		System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
		System.out.println(0);
		} else {
		System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
		int primeiroTermo = 0;
		int segundoTermo = 1;

		System.out.println(primeiroTermo);
		System.out.println(segundoTermo);

		int contador = 3;
		while (contador <= n) {
		int proximoTermo = primeiroTermo + segundoTermo;
		System.out.println(proximoTermo);
		primeiroTermo = segundoTermo;
		segundoTermo = proximoTermo;
		contador++;
		}
		}

		ler.close();
		}
		


	}


