package lab2;


public class Coisa {


    public static void main(String[] args) {
    	    
    		int [] peso = {6, 4};
            Disciplina prog2 = new Disciplina("PROGRAMACAO 2", 2, peso);

            prog2.cadastraHoras(4);

            prog2.cadastraNota(1, 5.0);

            prog2.cadastraNota(2, 6.0);

            System.out.println(prog2.aprovado());

            System.out.println(prog2.aprovado());

            System.out.println(prog2.toString());
            
      
/*
           

            ContaCantina cantinaSeuMatias = new ContaCantina("Seu Matias");            

            cantinaSeuMatias.cadastraLanche(2, 500);

            cantinaSeuMatias.cadastraLanche(1, 500);

            cantinaSeuMatias.pagaConta(200);

            System.out.println(cantinaSeuMatias.getFaltaPagar());

            System.out.println(cantinaSeuMatias.toString());


            Saude saude = new Saude();

            System.out.println(saude.getStatusGeral());

            saude.defineSaudeMental("boa");

            saude.defineSaudeFisica("boa");

            System.out.println(saude.getStatusGeral());


            saude.defineSaudeMental("fraca");

            saude.defineSaudeFisica("fraca");

            System.out.println(saude.getStatusGeral());


            saude.defineSaudeMental("boa");

            saude.defineSaudeFisica("fraca");

            System.out.println(saude.getStatusGeral());
*/
    }  

}