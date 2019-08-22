package lab2;

public class ContaLaboratorio {
	private String nome;
	private int espaco;
	private int cota;
	
	public ContaLaboratorio(String nome) {
		this.nome = nome;
		this.espaco = 0;
		this.cota = 2000;
	}
	
	public ContaLaboratorio(String nome, int cota) {
		this(nome);
		this.cota = cota;
	}	

	public void consomeEspaco(int mbytes) {
		this.espaco += mbytes;
	}
	
	public void liberaEspaco(int mbytes) {
		this.espaco -= mbytes;		
	}
			
	public boolean atingiuCota() {
		return this.espaco >= this.cota;
	}	
	
	@Override
	public String toString() {
		return 	this.nome + " " + this.espaco + "/" + this.cota;
	}

}
