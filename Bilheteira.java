import java.util.*;

public class Bilheteira {
	
	private Vector conjBilhetes=new Vector();

	public synchronized int getBilhete(){

	if(conjBilhetes.size()==0){

	System.err.println(Thread.currentThread	().getName()+" Nao ha bilhetes");

	return -1;

	}

	else{

	System.err.println(Thread.currentThread().getName()+" Bilhete comprado numero:"+((Bilhete)conjBilhetes.get(0)).getNum());

	Bilhete b=(Bilhete)conjBilhetes.remove(0);

	return b.getNum();

	}

	}

	public synchronized void setBilhete(int val) {

	System.err.println(Thread.currentThread().

	getName()+" Bilhete emitido num: "+val);

	//junta bilhete à bilheteira

	conjBilhetes.add(new Bilhete(val));

	}

	
	}