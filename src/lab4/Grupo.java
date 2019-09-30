package lab4;

import java.util.HashSet;
import java.util.Iterator;

public class Grupo {

	private String nome;
	private HashSet <Aluno> alunos;
	
	public Grupo(String nome) {
		if (nome == null) {
			throw new NullPointerException ("nao foi possivel cadastrar Grupo devido seu nome estar null");
		}

		this.nome = nome;
		this.alunos = new HashSet<>();
	} 
	
	/**
	 * Funcao para cadastrar o aluno no grupo
	 * @param nome Nome do aluno
	 * @param matricula Matricula do aluno
	 * @param curso Curso do aluno a ser cadastrado
	 * @return Caso o aluno ja esteja matriculado, entao retorna "CADASTRO REALIZADO!", senao "MATRICULA JA CADASTRADA!".
	 */
	public boolean cadastraAluno(Aluno aluno) {
		return this.alunos.add(aluno);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome.toUpperCase() == null) ? 0 : nome.toUpperCase().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (nome.toUpperCase() == null) {
			if (other.nome.toUpperCase() != null)
				return false;
		} else if (!nome.toUpperCase().equals(other.nome.toUpperCase()))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		String lista = "Alunos do grupo " + this.nome + ":" + System.lineSeparator();
		Iterator <Aluno> itr = this.alunos.iterator();
		
		while(itr.hasNext()) lista += "* " + itr.next();

		return lista + System.lineSeparator();
	}
	
	
	
}
