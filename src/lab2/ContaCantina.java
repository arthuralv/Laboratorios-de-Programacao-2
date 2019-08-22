package lab2;

public class ContaCantina {
	
	private String nomeDaCantina;
	private int qtdItens;
	private int valorCentavos;
	private int valorAtual;
	
	public ContaCantina(String nomeDaCantina) {
		this.nomeDaCantina = nomeDaCantina;
		this.qtdItens = 0;
		this.valorCentavos = 0;
	}
	
	public void cadastraLanche(int qtdItens, int valorCentavos) {
		this.qtdItens += qtdItens;
		this.valorCentavos += valorCentavos;
		this.valorAtual += valorCentavos;
	}
	
	public void pagaConta(int valorCentavos) {
		if (valorCentavos <= this.valorAtual) {
			this.valorAtual -= valorCentavos;
		} else {
			System.out.println("Por favor, refaca o pagamento com um valor valido!");
		}
	}

	public int getFaltaPagar() {
		return this.valorAtual;
	}
	
	@Override
	public String toString() {
		return this.nomeDaCantina + " " + this.qtdItens + " " + this.valorCentavos;
	}
}
