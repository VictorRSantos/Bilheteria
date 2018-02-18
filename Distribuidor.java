
public class Distribuidor extends Thread{
	
	
	private Bilheteira b;

	public Distribuidor(Bilheteira b){

	super("Distribuidor");

	this.b=b;

	}

	public void run(){

	for(int i=1;i<=80;i++)

	{

	try{

	Thread.sleep((int)(Math.random()*3000));

	}

	catch(InterruptedException e){

	System.err.println("\n"+e.toString());

	}

	b.setBilhete(i);

	}

	System.err.println("\n"+getName()+

	"Terminei!!!");

}
}