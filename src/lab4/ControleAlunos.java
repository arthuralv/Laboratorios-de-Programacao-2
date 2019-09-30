package lab4;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
* Laboratorio de Programacao 2 - Lab 4
*
* @author Arthur Almeida Alves - 119110792
* 
* Representacao de um controle academico dos alunos.
 */
public class ControleAlunos {
	
	/**
	 * Mapeamento de matricula para aluno
	 */
	private HashMap <String, Aluno> alunos;
	
	/**
	 * Mapeamento de nome do grupo para o grupo.
	 */
	private HashMap <String, Grupo> grupos;
	
	/**
	 * Lista com os alunos que responderam.
	 */
	private ArrayList <Aluno> alunosResponderam;
	
	/**
	 * Inicializador de um controle de alunos.
	 */
	public ControleAlunos() {
		this.alunos = new HashMap <>();
		this.grupos = new HashMap <>();
		this.alunosResponderam = new ArrayList<>();
	}
	
	/**
	 * Funcao para cadastrar o aluno no controle.
	 * @param nome Nome do aluno.
	 * @param matricula Matricula do aluno.
	 * @param curso Curso do aluno a ser cadastrado.
	 * @return Caso o aluno ja esteja matriculado, entao retorna "CADASTRO REALIZADO!", senao "MATRICULA JA CADASTRADA!".
	 */
	public String cadastraAluno(String nome, String matricula, String curso) {
		if (nome == null || matricula == null || curso == null) {
			throw new IllegalArgumentException ("Opcao");
		}
		if (!this.alunos.containsKey(matricula)) {
			this.alunos.put(matricula, new Aluno(nome, matricula, curso));
			return "CADASTRO REALIZADO!";
		} else {
			return "MATRICULA JA CADASTRADA!";
		}
	}
	
	/**
	 * Funcao para consultar um aluno pela sua matricula no controle.
	 * @param matricula Matricula do aluno a ser consultado.
	 * @return Retorna os dados do aluno caso ele exista, caso não, retorna "Aluno nao cadastrado".
	 */
	public String consultaAluno(String matricula) {
		if (this.alunos.containsKey(matricula)) {
			return "Aluno: " + this.alunos.get(matricula).toString();
		} else {
			throw new IllegalArgumentException ("Aluno nao cadastrado");
		}
	}
	
	/**
	 * Funcao para cadastrar grupo pelo nome.
	 * @param grupo Nome do grupo a ser cadastrado.
	 * @return Caso o grupo ja esteja cadastrado, entao retorna "CADASTRO REALIZADO!", caso nao "GRUPO JA CADASTRADO!".
	 */	
	public String cadastraGrupo(String grupo) {
		if (grupo == null) {
			throw new IllegalArgumentException ("Grupo nao cadastrado");
		}
		String chave = grupo.toUpperCase();
		
		if (!this.grupos.containsKey(chave)) {
			this.grupos.put(chave, new Grupo(grupo));
			return "CADASTRO REALIZADO!";
		}
		else {
			return "GRUPO JA CADASTRADO!";
		}
	}
	
	/**
	 * Funcao para alocar o aluno a um grupo.
	 * @param matricula Matricula para identificar qual Aluno sera alocado.
	 * @param grupo Nome do grupo para qual o aluno sera alocado.
	 * @return retorna "ALUNO ALOCADO" caso ja tenha cadastrado tanto o aluno, como o grupo ou sera retornado "aluno nao cadastrado"
	 *  caso o aluno nao esteja cadastrado e "grupo nao cadastrado" caso o grupo nao esteja cadastrado.
	 */
	public String alocaAluno(String matricula, String grupo) {
		if (!this.alunos.containsKey(matricula)) {
			throw new IllegalArgumentException ("Aluno nao cadastrado");
		} else if (!this.grupos.containsKey(grupo)) {
			throw new IllegalArgumentException ("Grupo nao cadastrado"); 
		}
		
		this.grupos.get(grupo).cadastraAluno(this.alunos.get(matricula));
		
		return "ALUNO ALOCADO!";
	}
	
	/**
	 * Funcao para imprimir a lista de alunos presentes em determinado grupo
	 * @param grupo Grupo no qual sera mostrado os alunos
	 * @return retorna uma String com uma lista de todos os alunos que estao no grupo
	 */
	public String imprimeGrupo(String grupo) {
		Grupo g = this.grupos.get(grupo);
		
		if (g == null) {
			throw new IllegalArgumentException ("Grupo nao cadastrado");
		} else {
			return this.grupos.toString();	
		}
	}
	
	/**
	 * Funcao para registrar aluno que respondeu o quadro
	 * @param matricula Matricula do aluno
	 * @return retorna que foi registrado ou, caso o aluno nao exista no sistema, que o aluno nao esta cadastrado
	 */
	public String registraAluno(String matricula) {
		Aluno a = this.alunos.get(matricula);
		
		if (a == null) {
			throw new IllegalArgumentException ("Aluno nao cadastrado");
		} else {
			this.alunosResponderam.add(a);
			return "ALUNO REGISTRADO";
		}		
	}
	
	/**
	 * Funcao para imprimir todos os alunos que responderam no quadro
	 * @return retorna uma String listando os alunos
	 */
	public String imprimeResponderam(){
		String respondeu = "Alunos: " + System.lineSeparator();
		
		for (Aluno a : this.alunosResponderam) {
			respondeu += (this.alunosResponderam.indexOf(a) +  1) + a.toString();
		}
		
		return respondeu + System.lineSeparator();
	}
}