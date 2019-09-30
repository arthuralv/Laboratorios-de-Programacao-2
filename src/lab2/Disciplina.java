package lab2;

import java.util.Arrays;

public class Disciplina {
	
	private String nome;
	private int horas;
	private double [] valorNotas;
	
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.horas = 0;
		this.valorNotas = new double [4];
	}

	public void cadastraHoras(int horas) {
		this.horas += horas;
	}

	public void cadastraNota(int nota, double valorNota) {
		this.valorNotas[nota - 1] = valorNota;
	}
	
	private double media() {
		double soma = 0;
		
		for(double valor: this.valorNotas) {
			soma += valor;
		}
		
		return (this.valorNotas.length > 0) ? soma / this.valorNotas.length : 0;
	}
	
	public boolean aprovado() {
		return this.media() >= 7.0;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.horas + " " + this.media() + " " + Arrays.toString(this.valorNotas);
	}

	
}
