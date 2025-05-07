package aula13;

import java.util.Scanner;

public class calculadoraSwitch {
	
	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		System.out.println("Que operação você irá fazer?\n+(1)\n-(2)\n*(3)\n/(4)");
		int escolha = ler.nextInt();
		int numero1, numero2, resultado;
		
		if (escolha <= 0 || escolha >= 5) {
			System.out.println("Escolhe certo irmão...");
		}else {
			System.out.println("Qual será o primeiro número?");
			numero1 = ler.nextInt();
			System.out.println("Qual será o segundo número?");
			numero2 = ler.nextInt();
			
			switch (escolha) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println(numero1 +" + " + numero2 +" = "+ resultado);
				ler.close();
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println(numero1 +" - " + numero2 +" = "+ resultado);
				ler.close();
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println(numero1 +" * " + numero2 +" = "+ resultado);
				ler.close();
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.println(numero1 +" / " + numero2 +" = "+ resultado);
				ler.close();
				break;
			}
		}
	}

}
