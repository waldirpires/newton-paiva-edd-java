package br.newtonpaiva.edd.u2;

public class Principal {

	public static void main(String[] args) {
		
		// criar a sacola
		Sacola s = new Sacola(2);
		
		// exibir a sacola na tela
		s.imprimir();
		
		// inserir um valor
		s.inserir(3);		
		// exibir a sacola na tela
		s.imprimir();
		
		// inserir um valor
		s.inserir(8);		
		// exibir a sacola na tela
		s.imprimir();

		// inserir um valor
		s.inserir(4);		
		// exibir a sacola na tela
		s.imprimir();
	
		// inserir um valor
		s.inserir(9);		
		// exibir a sacola na tela
		s.imprimir();
		
		// inserir um valor
		s.inserir(2);		
		// exibir a sacola na tela
		s.imprimir();
		
		// inserir um valor além da capacidade
		s.inserir(1);		
		// exibir a sacola na tela
		s.imprimir();
		
		
	}

}
