package br.newtonpaiva.edd.u3;

class Main {
	public static void main(String[] args) {
		// declaracao de variáveis
		TadListaEncadeada l;

		// criar a lista encadeada
		l = new TadListaEncadeada();
		// passando a capacidade para 4 valores
		l.criar(4);

		// estah vazia?
		if (l.tamanho == 0) {
			System.out.println("Lista está vazia!\n\n");
		}
		if (l.estahVazia()) {
			System.out.println("Lista está vazia!\n\n");
		}

		// insercao de itens
		int[] v = { 12, 9, 15, 17, 6 };
		for (int i = 0; i < v.length; i++) {
			System.out.println("Tentando inserir o valor " + v[i]);
			l.inserir(v[i]);
			// exibir os elementos da lista
			l.imprimir();
		}

		// pesquisa
		// retirada de um valor específico
		// retiradas do 1o ou ultimo elemento
		// inserção ordenada
	}
}