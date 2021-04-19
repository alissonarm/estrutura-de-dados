package br.com.alura.ed.lista.ligada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int totalDeElementos = 0;

	public void adicionaNoComeco(Object elemento) {

		if (totalDeElementos == 0) {
			Celula novaCelula = new Celula(elemento);
			this.primeira = novaCelula;
			this.ultima = novaCelula;
		} else {
			Celula novaCelula = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(novaCelula);
			this.primeira = novaCelula;
		}
		this.totalDeElementos++;
	}

	// adiciona no Fim
	public void adiciona(Object elemento) {
		if (totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		} else {
			Celula novaCelula = new Celula(elemento);
			this.ultima.setProximo(novaCelula);
			novaCelula.setAnterior(this.ultima);
			this.ultima = novaCelula;
			this.totalDeElementos++;
		}
	}

	private boolean existeCelula(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	private Celula pegaCelula(int posicao) {

		if (!existeCelula(posicao)) {
			throw new IllegalArgumentException("Posição inexistente");
		}

		Celula atual = primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;

	}

	public void adiciona(int posicao, Object elemento) {

		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == totalDeElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			Celula novaCelula = new Celula(anterior.getProximo(), elemento);
			novaCelula.setAnterior(anterior);
			anterior.setProximo(novaCelula);
			proxima.setAnterior(novaCelula);
			this.totalDeElementos++;
		}

	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco() {

		if (totalDeElementos == 0) {
			throw new IllegalArgumentException("Lista Vazia");
		}

		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;

		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}

	// remove do fim
	public void removeDoFim(int posicao) {
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultimo = this.ultima.getAnterior();
			penultimo.setProximo(null);
			this.ultima = penultimo;
			this.totalDeElementos--;
		}

	}

	// remove qualquer posicao
	public void remove(int posicao) {
		if (this.totalDeElementos == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim(posicao);
		} else {
			Celula anterior = this.pegaCelula(posicao -1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			this.totalDeElementos--;
		}

	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;
		
		while (atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProximo();
		}
		
		return false;
	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		Celula atual = primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}
}
