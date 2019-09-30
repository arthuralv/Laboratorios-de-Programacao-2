package lab2;

public class Saude {
	
	private String saudeMental;
	private String saudeFisica;
	
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
		}
	
	public String getStatusGeral(){
		if (this.saudeMental.equals(this.saudeFisica)) {
			return (this.saudeMental.equals("boa") ? "boa" : "ok");
		}
		else {
			return "fraca";
		}
		
	}
	
	public void defineSaudeMental(String saude) {
		this.saudeMental = saude;
	}
	
	public void defineSaudeFisica(String saude) {
		this.saudeFisica = saude;
	}
	
	
	
}
