package aula13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numerosMagicos {
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner ler = new Scanner(System.in);
		int[] numerosMagicos = new int[5];
		int[] palpites = new int[5];
		int acertos = 0;

		System.out.println("Números Mágicos!");
		System.out.println("Tente adivinhar 5 números entre 1 e 50.");

		for (int i = 0; i < 5; i++) {
		numerosMagicos[i] = random.nextInt(50) + 1;
		}

		System.out.println("Digite seus 5 palpites:");
		for (int i = 0; i < 5; i++) {
		System.out.print("Palpite " + (i + 1) + ": ");
		palpites[i] = ler.nextInt();
		}

		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
		if (palpites[i] == numerosMagicos[j]) {
		acertos++;
		break;
		}
		}
		}

		System.out.println("\nNúmeros Mágicos eram: " + Arrays.toString(numerosMagicos));
		System.out.println("Você acertou: " + acertos + " número(s).");

		ler.close();
		}

		
	}


