package aula13;

import java.util.Scanner;

public class tabuadaInterativa {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("De que número você quer fazer uma tabuada?");
		int tabuada = ler.nextInt();
		int resultado;
		
		for (int i = 1; i <= 10; i++) {
			resultado = tabuada * i;
			System.out.println(tabuada +"*"+ i +"= "+ resultado);
		}ler.close();
	}

}
