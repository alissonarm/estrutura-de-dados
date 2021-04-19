package br.com.alura.teste;

import java.util.LinkedList;
import java.util.Queue;

import br.com.alura.ed.fila.Fila;

public class FilaTeste {
	
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		fila.adiciona("Aluno 1");
		fila.adiciona("Aluno 2");
		fila.adiciona("Aluno 3");
		fila.adiciona("Aluno 4");
		fila.adiciona("Aluno 5");
		
		fila.remove();
		System.out.println(fila);
		
		Queue<String> filaDoJava = new LinkedList<String>();
		filaDoJava.add("Mauricio");
		filaDoJava.add("Eu");
		
		//Devolve o proximo a ser removido
		String x2 = filaDoJava.poll();
		System.out.println(x2);
		
		
	}
}
