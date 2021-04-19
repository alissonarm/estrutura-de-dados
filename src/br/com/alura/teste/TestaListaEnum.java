package br.com.alura.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.alura.ed.tabela.ListaEnum;
import br.com.alura.ed.vetor.Aluno;

public class TestaListaEnum {

	public static void main(String[] args) {

		List<ListaEnum> lista = Arrays.asList(ListaEnum.    values());
		Aluno[] esperado;

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).ordinal() + " - " + lista.get(i).name() + " , Quantidade de Alunos ==> "
					+ lista.get(i).getEsperados().length);

			esperado = lista.get(i).getEsperados();
			int j = 0;
			for (Aluno al : esperado) {
				j++;
				System.out.println(j + ") " + al.getNome() + " , " + al.getIdade() + " , " + al.getSexo());
			}
		}

		System.out.println("#####################################################################################");
		
		List<ListaEnum> ordena = Arrays.asList(ListaEnum.values());
		Collections.sort(ordena, new Comparadir());
		for (ListaEnum item : ordena) {
			System.out.println(item.name()  + " , " + item.getCodigo());
		}
		
		
	}

}
