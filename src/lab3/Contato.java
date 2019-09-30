package lab3;

public class Contato {
	/**
	 * Representacao de um contato
	 * @author Arthur Almeida Alves	
	 */

	
	/** 
	 * Nome do contato
	 */
	private String nome;
	
	/**
	 * Sobrenome do contato
	 */
	private String sobrenome;
	
	/**
	 * Telefone do contato
	 */
	private String telefone;
	
	/**
	 * Constroi o contato a partir de seus parametros
	 * @param nome nome do contato
	 * @param sobrenome sobrenome do contato
	 * @param telefone telefone do contato
	 */	
	public Contato(String nome, String sobrenome, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
	}
	
	/**
	 * sobrecarrega a funcao de Object, fazendo com que passe a mostrar com a formatacao "nome - sobrenome - telefone"	
	 */
	@Override
	public String toString() {
		return this.nome + " - " + this.sobrenome + " - " + this.telefone;
	}
	
	
	
}
