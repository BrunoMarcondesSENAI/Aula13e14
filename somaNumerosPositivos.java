package aula13;

import java.util.Scanner;

public class somaNumerosPositivos {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
      System.out.println("Vamos somar!\nPrimeiro número?");
      int numero1 = ler.nextInt();
      int numero2 = 0, resultado = 0;
      
      
      while (numero1 != 0) {
    	  
    	  resultado = numero2 + numero1;
    	  numero2 = resultado;
    	  System.out.println("Próximo número?");
    	  numero1 = ler.nextInt();
      }System.out.println("O resultado foi: "+resultado);
	}

}
