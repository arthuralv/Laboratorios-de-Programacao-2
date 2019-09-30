package lab2;

public class ContaCantina {
	
	private String dono;
	private double saldo;
	private int produtos;
	
	public ContaCantina(String dono) {
		this.dono = dono;
		this.saldo = 0;
	}

	public void cadastraLanche(int quantidade, double preco) {
		this.saldo += quantidade * preco;
		this.produtos += quantidade;
	}
	
	public void pagaConta(double dinheiro) {
		this.saldo -= dinheiro;
	}
	
	public double getFaltaPagar() {
		return this.saldo;
	}
	
	@Override
	public String toString() {
		return this.dono + " " + this.produtos + " " + this.saldo;
	}
	
}
