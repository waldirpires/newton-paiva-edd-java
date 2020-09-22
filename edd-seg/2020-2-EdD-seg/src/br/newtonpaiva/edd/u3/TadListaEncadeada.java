package br.newtonpaiva.edd.u3;

class TadListaEncadeada {
	TadCelula primeiro;
	TadCelula ultimo;
	int tamanho;
	int capacidade;

	public void criar(int cap) {
		// celula cabeca criada
		primeiro = new TadCelula();
		ultimo = primeiro;
		tamanho = 0;
		capacidade = cap;
	}

	public void imprimir() {
		TadCelula aux = primeiro.prox;
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Capacidade: " + capacidade);
		System.out.print("Primeiro -> ");
		while (aux != null) {
			System.out.print("[" + aux.valor + "] -> ");
			aux = aux.prox;
		}
		System.out.println("NULL");
	}

	public boolean estahVazia() {
		return primeiro == ultimo;
	}

	public boolean estahCheia() {
		return tamanho == capacidade;
	}

	public void inserir(int valor) {
		// estah cheia?
		if (estahCheia()) {
			System.out.println("Lista está CHEIA!\n\n");
		} else {
			TadCelula nova = new TadCelula();
			ultimo.prox = nova;
			ultimo = nova;
			nova.valor = valor;
			tamanho++;
		}
	}
}