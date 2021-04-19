package br.com.alura.ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

	private List<String> nomes = new LinkedList<String>();

	
	// insere
	public void push(String nome) {
		nomes.add(nome);
	}
	
	// remove
	public String pop() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazio() {
		return nomes.isEmpty();
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
	
}
