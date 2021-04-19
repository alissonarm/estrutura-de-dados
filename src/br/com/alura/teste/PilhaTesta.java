package br.com.alura.teste;

import java.util.Stack;

import br.com.alura.ed.pilha.Pilha;

public class PilhaTesta {

	public static void main(String[] args) {
	 
		Pilha pilha = new Pilha();
		pilha.push("Alisson");
		pilha.push("Luana");
		pilha.push("Julia");
		pilha.push("valdeci");
		
		System.out.println(pilha);
	
		pilha.pop();
		System.out.println(pilha);
		
		
		Stack<String> stack = new Stack<String>();
		stack.push("Teste 1");
		stack.push("Teste 2");
		stack.push("Teste 3");
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		// devolve o ultimo elemento da pilha
		String string = stack.peek();
		System.out.println(string);
		
	}

}
