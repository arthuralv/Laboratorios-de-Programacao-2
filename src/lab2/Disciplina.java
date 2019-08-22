package lab2;

import java.util.Arrays;

public class Disciplina {

	private String nome;
	private int horas;
	private double [] valorNotas;
	private int [] pesos;

	public Disciplina(String nome) {
		this.nome = nome;
		this.horas = 0;
		this.valorNotas = new double[4];
	}

	public Disciplina(String nome, int qtdNotas) {
		this(nome);
		this.valorNotas = new double[qtdNotas];
	}

	public Disciplina(String nome, int qtdNotas, int [] pesos) {
		this(nome, qtdNotas);
		this.pesos = pesos;
	}

	public void cadastraHoras(int horas) {
		this.horas += horas;
	}

	public void cadastraNota(int nota, double valorNota) {
		this.valorNotas[nota - 1] = valorNota;

	}

	private double media() {
		double soma = 0;
		if (this.pesos == null) {
			for (int i = 0; i < this.valorNotas.length; i++) {
				soma += this.valorNotas[i];
			}
			
			return soma / this.valorNotas.length;
			
		} else {
			for (int i = 0; i < this.valorNotas.length; i++) {
				soma += this.valorNotas[i] * this.pesos[i];
			}
			
			return soma / 10.0;
		}
	}

	public boolean aprovado() {
		return this.media() >= 7.0;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.horas + " " + this.media() + " " + Arrays.toString(this.valorNotas);
	}

}
