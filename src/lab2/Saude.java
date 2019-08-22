package lab2;

public class Saude {
	
	private String saudeMental;
	private String saudeFisica;

	public Saude(){
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
	}
	
	public void	defineSaudeMental(String saudeMental) {
		this.saudeMental = saudeMental;
	}
	
	public void	defineSaudeFisica(String saudeFisica) {
		this.saudeFisica = saudeFisica;
	}
	
	public String getStatusGeral() {
		if (this.saudeMental.equals("boa") && this.saudeFisica.equals("boa")) {
			return "boa";
		} else if (this.saudeMental.equals("boa") || this.saudeFisica.equals("boa")){
			return "ok";
		} else {
			return "fraca";
		}
	}

}

