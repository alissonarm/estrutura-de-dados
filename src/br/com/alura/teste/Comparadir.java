package br.com.alura.teste;

import java.util.Comparator;

import br.com.alura.ed.tabela.ListaEnum;

public class Comparadir implements Comparator<ListaEnum> {

	@Override
	public int compare(ListaEnum o1, ListaEnum o2) {
		
		Integer cd1 = o1.getCodigo();
		Integer cd2 = o2.getCodigo();

		int i = cd1.compareTo(cd2);
		return i;
	}

}
