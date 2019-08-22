package lab2;

public class Aluno {
	Disciplina [] disciplinas;
	ContaCantina [] contasCantinas;
	ContaLaboratorio [] contaLaboratorio;
	Saude saude;
	
	public Object [] expandeArray(Object [] array) {
		if (array.length == 0) {
			return new Object [1];
		}
		Object [] temp = new Object [array.length * 2];
		System.arraycopy(array, 0, temp, 0, array.length);
		return temp;
	}
	public void cadastraLaboratorio(String nomeLaboratorio) {
	
	}
	public void cadastraLaboratorio(String nomeLaboratorio, int cota) {
		
	}
	public void consomeEspaco(String nomeLaboratorio, int mbytes) {
		
	}
	public void liberaEspaco(String nomeLaboratorio, int mbytes) {
		
	}
	public boolean atingiuCota(String nomeLaboratorio) {
		
	}
	public String laboratorioToString(String nomeLaboratorio) {
		
	}
	public void cadastraDisciplina(String nomeDisciplina) {
		
	}
	public void cadastraHoras(String nomeDisciplina, int horas) {
		
	}
	public void cadastraNota(String nomeDisciplina, int nota, double valorNota) {
		
	}
	public boolean aprovado(String nomeDisciplina) {
		
	}
	public String disciplinaToString(String nomeDisciplina) {
		
	}
	public void cadastraCantina(String nomeCantina) {
		
	}
	public void cadastraLanche(String nomeCantina, int qtdItens, int valorCentavos) {
		
	}
	public void pagarConta(String nomeCantina, int valorCentavos) {
		
	}
	public int getFaltaPagar(String nomeCantina) {
		
	}
	
	public String cantinaToString(String nomeCantina) {
		
	}
	public void defineSaudeMental(String valor) {
		
	}
	public void defineSaudeFisica(String valor) {
		
	}
	public String getStatusGeral() {
		
	}
}
