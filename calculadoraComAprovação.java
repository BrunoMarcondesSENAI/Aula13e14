package aula13;

import java.util.Scanner;

public class calculadoraComAprovação {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota;
		double soma = 0;
		int contadorNotas = 0;

		System.out.println("Digite as notas do aluno (digite um valor negativo para parar):");

		while (true) {
		System.out.print("Digite a nota: ");
		nota = ler.nextDouble();

		if (nota < 0) {
		break;
		}

		soma += nota;
		contadorNotas++;
		}

		if (contadorNotas == 0) {
		System.out.println("Nenhuma nota foi digitada.");
		} else {
		double media = soma / contadorNotas;
		System.out.println("\nMédia do aluno: " + media);

		if (media >= 7.0) {
		System.out.println("Situação: aprovado");
		} else if (media >= 5.0) {
		System.out.println("Situação: recuperação");
		} else {
		System.out.println("Situação: reprovado");
		}
		}

		ler.close();
		}
		
	}

