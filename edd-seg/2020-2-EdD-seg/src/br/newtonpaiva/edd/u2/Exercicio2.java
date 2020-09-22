package br.newtonpaiva.edd.u2;

import java.util.Scanner;

public class Exercicio2 {

	// entrada: uma frase digitada pelo usuário
	
	// saída: informar a quantidade de palavras na frase
	
	public static void main(String[] args) {
        int numPalavras = 0;
		
		Scanner sc = new Scanner(System.in);
		// solicitar uma frase do usuário
		System.out.println("Digite uma frase:");
		// lêe a frase		
		String frase = sc.nextLine();
		
		// remover espaços nas duas pontas da frase
		frase = frase.trim();
		
		// identificar as palavras da frase (espaços) 
		for (int i = 0; i < frase.length(); i++) {
			// se o caractere na frase no indice i for igual a espaço
			if (frase.charAt(i) == ' ') {
				numPalavras++;
			}
		}
		
		// somar para incluir a ultima palavra
		numPalavras++;
		
		System.out.println("Número de palavras: "+ numPalavras);
		
		sc.close();

		// percorrer de forma contrária a frase (do final para o inicio)
		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
		System.out.println();	
	
	}

}
