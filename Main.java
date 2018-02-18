/*Autor: Victor Rodirgues dos Santos
 * Professor Israel - Sistema Operacionais
 * Programa faz uma simulação de bilheteria
 * java - Thread*/

public class Main {

	public static void main(String[] args) {
		
		Bilheteira b = new Bilheteira();

		Distribuidor d = new Distribuidor(b);

		Comprador c1= new Comprador(b,"Comprador1");

		Comprador c2= new Comprador(b,"Comprador2");

		d.start();

		c1.start();

		c2.start();

	}

}
