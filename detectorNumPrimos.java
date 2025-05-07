package aula13;

import java.util.Scanner;

public class detectorNumPrimos {
	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	System.out.print("Digite um número inteiro positivo: ");
	int numero = ler.nextInt();

	if (numero <= 1) {
	System.out.println(numero + " não é primo.");
	ler.close();
	return;
	}

	for (int i = 2; i <= numero / 2; i++) {
	if (numero % i == 0) {
	System.out.println(numero + " não é primo.");
	ler.close();
	return;
	}
	}

	System.out.println(numero + " é primo.");
	ler.close();
}}
	

