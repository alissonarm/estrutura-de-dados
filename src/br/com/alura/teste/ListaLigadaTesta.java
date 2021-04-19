package br.com.alura.teste;

import br.com.alura.ed.lista.ligada.ListaLigada;

public class ListaLigadaTesta {

	public static void main(String[] args) {
		ListaLigada listaLigada = new ListaLigada();
		
		System.out.println(listaLigada);
		
		listaLigada.adicionaNoComeco("mauricio");
		System.out.println(listaLigada);
		
		listaLigada.adicionaNoComeco("paulo");
		System.out.println(listaLigada);
		
		listaLigada.adicionaNoComeco("guilherme");
		System.out.println(listaLigada);
		
		listaLigada.adiciona("Alisson");
		System.out.println(listaLigada);
		
		listaLigada.adiciona(2, "Agni");
		System.out.println(listaLigada);


	}

}
