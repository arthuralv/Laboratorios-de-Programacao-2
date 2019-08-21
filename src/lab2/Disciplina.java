package lab2;

public class Disciplina {
	
	private String nome;
	private int horas;
	private int[] notas;
	private double [] valorNotas;
	
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.horas = 0;
		this.notas = new int [4];
		this.valorNotas = new double [4];
	}

	public void cadastraHoras(int horas) {
		this.horas += horas;
	}

	public void cadastraNota(int nota, double valorNota) {
		for (int i = 0; i < this.notas.length; i++) {
			if (nota == this.notas[i]) {
				this.valorNotas[i] = valorNota;
			}
		}
		
	}
	
	private double media() {
		double soma = 0;
		
		for (int i = 0; i < this.notas.length; i++) {
			soma += this.notas[i];
		}
		
		return soma / this.notas.length;
	}
	
	public boolean aprovado() {
		return this.media() >= 7.0;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.horas + " " + this.media();
	}

	
}
