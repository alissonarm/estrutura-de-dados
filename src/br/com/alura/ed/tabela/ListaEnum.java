package br.com.alura.ed.tabela;

import br.com.alura.ed.vetor.Aluno;

public enum ListaEnum  {

	PRIMEIRO("classe A", 6, new Aluno("Alisson", 15, "M", "ENDERECO N"), new Aluno("Alex", 25, "M", "ENDERECO O"), new Aluno("Alessandro", 40, "M", "ENDERECO V"),
			new Aluno("Alemao", 30, "M", "ENDERECO M")),
	SEGUNDO("classe BB", 1, new Aluno("Bruno", 16, "M", "ENDERECO L"), new Aluno("Breno", 20, "M", "ENDERECO K")),
	TERCEIRO("classe CCC", 3, new Aluno("Maria", 12, "F", "ENDERECO H"), new Aluno("Mariana", 54, "F", "ENDERECO G"), new Aluno("Meiri", 8, "F", "ENDERECO F")),
	DECIMO("classe DDD", 5, new Aluno("Maria", 12, "F", "ENDERECO D")),
	QUINTO("classe EEE", 4, new Aluno("Maria", 12, "F", "ENDERECO C")),
	OPA("classe FDD", 0, new Aluno("YYYY", 12, "F", "Endereco B")),
	TESTE("classe SEE", 2, new Aluno("XXXX", 12, "F", "Endereco a"));


	private final Integer codigo;
	private String classe;
	private final Aluno[] esperados;

	ListaEnum(String classe, int codigo, Aluno... esperados) {
		this.codigo = codigo;
		this.classe = classe;
		this.esperados = esperados;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getClasse() {
		return classe;
	}

	public Aluno[] getEsperados() {
		return esperados;
	}


}
