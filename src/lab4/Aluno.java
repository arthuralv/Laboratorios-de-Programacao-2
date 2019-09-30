package lab4;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	
	public Aluno (String nome, String matricula, String curso) {
		this.verificaErro(nome, matricula, curso);
		
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.matricula + " - " + this.nome + " - " + this.curso + System.lineSeparator();
	}
	
	public void verificaErro(String nome, String matricula, String curso){
		if(nome == null) {
			throw new NullPointerException ("nao foi possivel cadastrar Aluno devido seu nome estar null");
		} else if (matricula == null) {
			throw new NullPointerException ("nao foi possivel cadastrar Aluno devido sua matricula estar null");
		} else if (curso == null) {
			throw new NullPointerException ("nao foi possivel cadastrar Aluno devido seu curso estar null");
		}
	}
	
}
