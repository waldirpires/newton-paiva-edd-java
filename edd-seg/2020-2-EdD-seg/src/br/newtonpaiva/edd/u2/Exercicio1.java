package br.newtonpaiva.edd.u2;

import java.util.Scanner;

import br.newtonpaiva.util.JOptionPaneUtil;

/**
 * 
Problema
Entrada: número inteiro digitado pelo usuário
Saída: informar:

a) se o número é par ou impar
b) se o número é primo ou não

Algoritmo

1. Solicitar do usuário um ńumero inteiro (1-10)
2. Ler o número do usuário (N)
3. Calcular o resto da divisão de N por 2
4. Se o resto for igual a zero
4.1 O numero é par
5. Senão
5.1 O numero é impar
6. Assumir que N é primo
7. Se N for 1 ou 2
7.1 N é primo
8. Senão
8.1 Para cada número de 2 até N-1
8.1.1 Se esse número divide N
8.1.1.1 N não é primo
8.1.1.2 Sair (break)
9. Se nao houver divisores
9.1 N é primo
 *
 */

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		String s = JOptionPaneUtil.exibirJanelaDeEntrada("Digite um número inteiro (1-10");
		System.out.println("Digite um número inteiro: ");
		
//		
//		JOptionPaneUtil.exibirJanelaInformacao("Saída", "Você digitou: " + s);
		
		//int n = Integer.parseInt(s);
		
		int n = sc.nextInt();

		// PAR O IMPAR
		int r = n % 2;
		
		if (r == 0) {
			//JOptionPaneUtil.exibirJanelaInformacao("Saída", "O número é PAR.");
			System.out.println("PAR");
		} else {
			//JOptionPaneUtil.exibirJanelaInformacao("Saída", "O número é IMPAR.");
			System.out.println("IMPAR");
		}

		// PRIMO
		boolean primo = true; // assumir que n é primo
		if (n > 2) {
 			for (int i = 2; i < n; i++) {
 				System.out.println("Dividindo por " + i);
 				if (n % i == 0) { // se encontramos um divisor de N
 					primo = false; // não é primo
 					break;
 				}
 			}
		}
		
		if (primo) {
			//JOptionPaneUtil.exibirJanelaInformacao("Saída", "O número é PRIMO.");
			System.out.println("PRIMO");
		} else {
			//JOptionPaneUtil.exibirJanelaInformacao("Saída", "O número NÃO é PRIMO.");
			System.out.println("Não PRIMO");
		}
		
	}
	
}
