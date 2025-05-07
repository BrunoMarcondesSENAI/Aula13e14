package aula13;

import java.util.Random;
import java.util.Scanner;

public class advinhacao {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int sistema = random.nextInt(100);
		sistema++;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Estou pensando em um número, tente adivinhar qual é!");
		int chute = ler.nextInt();
		
		while (sistema != chute) {
			if (chute > sistema) {
				System.out.println(chute + "? Não kk, chutou alto kkk. Tenta dnv");
				chute = ler.nextInt();
			} else if (chute < sistema) {
				System.out.println(chute + "? Não kk, chutou baixo kkk. Tenta dnv");
				chute = ler.nextInt();
			}
					}System.out.println(chute +"?! Boa! você acertou! :D");
					ler.close();
	}

}
