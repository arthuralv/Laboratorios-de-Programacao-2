package lab3;

public class Agenda {
	/**
	 * Representacao de uma agenda
	 * @author Arthur Almeida Alves
	 */
	
	/**
	 * Array de contatos
	 */
	private Contato [] contatos;
	
	/**
	 * Constroi a Agenda
	 */
	
	public Agenda() {
		this.contatos = new Contato [100];
	}
	
	/**
	 * E passado como parametro os atributos de Contato e a posicao desejada.
	 * Atribui o contato passado como parametro
	 * @param nome nome do contato
	 * @param sobrenome sobrenome do contato
	 * @param telefone telefone do contato
	 * @param posicao posicao na agenda
	 * @return "CADASTRO REALIZADO" caso ele encontre uma posicao vazia
	 * @throws "POSICAO INVALIDA" caso a posicao seja invalida
	 * */
	public String cadastraContato (int posicao, String nome, String sobrenome, String telefone) {
		if (posicao < 0 || posicao > 101){
			throw new IllegalArgumentException ("POSICAO INVALIDA");
		} else {
			Contato c = new Contato(nome, sobrenome, telefone);
			this.contatos[posicao - 1] = c;
			return "CADASTRO REALIZADO!";
		}
	}
	
	/**
	 * 
	 * @return retorna uma lista com todos os contatos cadastrados
	 */
	public String listaContatos() {
		String rep = "";
		for (int i = 0; i < this.contatos.length; i++) {
			if(this.contatos[i] != null) {
				rep += (i + 1) + " " + contatos[i] + System.lineSeparator();
			}
		}
		return rep;
	}
	
	/**
	 * 
	 * @param posicao posicao do contato na lista contatos
	 * @return exibe o contato caso a posicao seja valida. Caso nao, exibe "POSICAO INVALIDA"
	 * @throws IllegalArgumentException caso a posicao seja invalida, lanca excecao 
	 */

	public String exibirContato(int posicao) {
		if (posicao < 0 || posicao > 101){
			throw new IllegalArgumentException ("POSICAO INVALIDA");
		} else {
			return System.lineSeparator() + this.toString() + System.lineSeparator() + System.lineSeparator();
		}
	}
		
}
