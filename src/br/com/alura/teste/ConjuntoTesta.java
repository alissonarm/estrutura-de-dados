package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

import br.com.alura.ed.conjunto.Conjunto;

public class ConjuntoTesta {

	public static void main(String[] args) {

		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("Elemento 1");
		conjunto.adiciona("Elemento 2");
		conjunto.adiciona("Elemento 3");
		conjunto.adiciona("Teste 1");
		System.out.println(conjunto);
		
		conjunto.remove("Teste 1");
		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		conjuntoDoJava.add("Paula");
		conjuntoDoJava.add("Karla");
		conjuntoDoJava.add("taissa");
		System.out.println(conjuntoDoJava);
		
		String x = "Guilherme";
		x.hashCode();
		
		System.out.println("Guilherme".hashCode());
		System.out.println(x.hashCode());
		

	}

}
