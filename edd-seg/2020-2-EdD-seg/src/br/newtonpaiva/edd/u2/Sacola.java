package br.newtonpaiva.edd.u2;

public class Sacola {

	// constante, limitar a quantidade máxima de itens na sacola
	private static final int MAX = 100;
	
	// quantos itens eu tenho atualmente na sacola
	private int tamanho;
	
	// quantidade de itens que a sacola suporta
	private int capacidade;
	
	// vetor onde os valores serão armazenados
	private int v[];
	
	// construtor: criar uma sacola da capacidade informada 
	public Sacola(int capacidade) {
		
		// validar se a capacidade solicitada está dentro do limite possível
		if (capacidade > MAX) {
			// lancar um erro no programa para ele encerrar
			throw new RuntimeException(
					"ERRO: Capacidade solicitada acima do limite permitido");
		}
		
		// definindo a capacidade da sacola de acordo com o valor passado
		this.capacidade = capacidade;
		
		// sacola inicialmente vazia
		this.tamanho = 0;
		
		// alocando o espaço para armazenar os valores
		this.v = new int[capacidade];
		
		// PARA-CASA 1: inicializar TODAS as posições do VETOR
		// com -1 (agora elas iniciam com zero)
	}
	
	// imprimir a sacola
	public void imprimir() {
		System.out.println("Sacola:");
		// informacoes de tamanho e capacidade da sacola
		System.out.println("Tamanho/Capacidade: " + tamanho + "/" + capacidade);
		
		// imprimindo os valores contidos na sacola
		System.out.println("Valores: ");
		for (int i = 0; i < v.length; i++) {
			// imprimindo cada valor da sacola
			System.out.print(v[i] + " ");
		}
		System.out.println();
	}
	
	// inserção dos itens
	public void inserir(int valor) {
		// verificar se a sacola está cheia
		if (tamanho == capacidade) {
			System.out.println("Sacola cheia!");
			
			// se nao puder crescer o vetor de forma dinâmica
			if (!podeCrescer()) {
				// sair da operação de inserção
				return;
			}
			// realizar o crescimento da sacola
			crescer();
		}
		
		// salvando o valor na memoria da sacola
		v[tamanho] = valor;
		
		// incrementar o tamanho da sacola
		tamanho++;
	}	
	
	private boolean podeCrescer() {
		// se o crescimento levar a uma sacola maior que o maximo permitido
		return capacidade * 2 < MAX;
	}
	
	// funcionalidade que permite aumentar a capacidade da sacola
	// alocação dinâmica: em tempo de execução
	private void crescer() {
		
		System.out.println("Crescendo a sacola . . .\n");
		
		// alocar um novo vetor temporário para o crescimento
		int [] temp = new int[capacidade * 2];
		
		// copiar os valores de v para este vetor temporário
		for (int i = 0; i< capacidade; i++) {
			// copiando valor por valor
			temp[i] = v[i];
		}
		
		// atualizar o vetor da sacola
		v = temp;
		
		// atualizar a capacidade nova
		capacidade = capacidade * 2;		
	}
	
	// PARA-CASA 3: implementar a retirada de um valor informado
	private void retirar(int valor) {
		
	}
	
	// PARA-CASA 2: implementar a pesquisa (sequencial)
	private int pesquisar(int valor) {
		
		return -1;
	}
}
