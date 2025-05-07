package aula13;

import java.util.Scanner;

public class verificadorTriangulo {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3;
		System.out.println("Quais são os valores do triângulo?\nValor 1:");
		valor1 = ler.nextInt();
		System.out.println("Valor 2:");
		valor2 = ler.nextInt();
		System.out.println("Valor 3:");
		valor3 = ler.nextInt();
		
		if (valor1 == valor2 && valor2 == valor3) {
			System.out.println("Equilátero");
		} else if (valor1 != valor2 && valor2 != valor3) {
			System.out.println("Escaleno");
		} else {
			System.out.println("Isóceles");
		} ler.close();
	}

}
