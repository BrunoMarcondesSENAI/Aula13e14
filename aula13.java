package aula13;

import java.util.Random;
import java.util.Scanner;

public class corridaMaluca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		String[] corredores = new String[3];
		int[] posicoes = {0, 0, 0};

		System.out.println("Bem-vindos à Corrida Maluca!");

		for (int i = 0; i < 3; i++) {
		System.out.print("Digite o nome do corredor " + (i + 1) + ": ");
		corredores[i] = ler.nextLine();
		}

		System.out.println("\nComeçou a corrida!");

		for (int volta = 1; volta <= 5; volta++) {
		System.out.println("\n--- Volta " + volta + " ---");
		for (int i = 0; i < 3; i++) {
		int avanco = random.nextInt(10) + 1;
		posicoes[i] += avanco;
		System.out.println(corredores[i] + " está na posição: " + posicoes[i] + " metros.");
		}
		}

		System.out.println("\n - Fim da Corrida! -");

		int campeaoIndice = 0;
		for (int i = 1; i < 3; i++) {
		if (posicoes[i] > posicoes[campeaoIndice]) {
		campeaoIndice = i;
		}
		}

		System.out.println("O campeão da Corrida Maluca é: " + corredores[campeaoIndice] + "!");

		ler.close();

		}

		
	}


