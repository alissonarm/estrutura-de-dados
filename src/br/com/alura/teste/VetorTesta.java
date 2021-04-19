package br.com.alura.teste;
import br.com.alura.ed.vetor.Aluno;
import br.com.alura.ed.vetor.Vetor;

public class VetorTesta {

	public static void main(String[] args) {

		Aluno aluno01 = new Aluno("João", 10, "M", "rua joaquina, 25");
		Aluno aluno02 = new Aluno("Maria", 15, "F", "quadra 05, conjunto a , casa 10");
		Aluno aluno03 = new Aluno("Danilo", 20, "M", "quadra 206, bloco h, apt 1104");
		
		Vetor vetor = new Vetor();
		
		vetor.adiciona(aluno01);
		vetor.adiciona(aluno02);
		
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
		System.out.println(aluno01);
		System.out.println(vetor.contem(aluno03));
		
		System.out.println(vetor.pega(1));
//		System.out.println(vetor.pega(200));
		
		vetor.adiciona(aluno03, 1);
		System.out.println(vetor);

	}

}
