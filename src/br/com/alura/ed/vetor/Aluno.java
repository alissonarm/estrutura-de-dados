package br.com.alura.ed.vetor;

public class Aluno  {
	
	private String nome;
	private int idade;
	private String sexo;
	private String endereco;

	public Aluno(String nome, int idade, String sexo, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	public String getSexo() {
		return sexo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEndereco() {
		return endereco;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		Aluno outro = (Aluno) obj;
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {
		return nome + " " + idade + " " + sexo;
	}


	
}
